/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.integration.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import jp.co.namihira.emotionbook.integration.dto.ContentDto;

/**
 * Contents Dao
 */
@Repository
public class ContentsDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<ContentDto> seletctByEmotionTagId(final int emotionTagId) {
        return jdbcTemplate.query(
                "SELECT * FROM contents WHERE id IN ("
                + "SELECT contentId FROM content_emotion WHERE emotionTagId = " + emotionTagId
                + ") ORDER BY id DESC LIMIT 100",
                new BeanPropertySqlParameterSource(new ContentDto()),
                new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
    }

    public List<ContentDto> selectAll(){
        return jdbcTemplate.query(
                "SELECT * FROM contents ORDER BY id DESC LIMIT 100",
                new BeanPropertySqlParameterSource(new ContentDto()),
                new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
    }

    public int insert(final ContentDto dto){
        dto.setCreatedAt(LocalDateTime.now());
        final KeyHolder keyHolder = new GeneratedKeyHolder();
        final int result = jdbcTemplate.update(
                              "INSERT INTO contents "
                              + "(content, createdAt)" + " VALUES "
                              + "(:content, :createdAt)",
                              new BeanPropertySqlParameterSource(dto),
                              keyHolder, new String[]{"id"});
        dto.setId(keyHolder.getKey().intValue());
        return result;
    }

}
