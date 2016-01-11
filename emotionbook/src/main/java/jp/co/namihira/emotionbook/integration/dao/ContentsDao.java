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
import org.springframework.stereotype.Repository;

import jp.co.namihira.emotionbook.integration.dto.ContentDto;

/**
 * Contents Dao
 */
@Repository
public class ContentsDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<ContentDto> selectAll(){
        return jdbcTemplate.query(
                "SELECT * FROM contents",
                new BeanPropertySqlParameterSource(new ContentDto()),
                new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
    }

    public int insert(final ContentDto dto){
        dto.setCreatedAt(LocalDateTime.now());
        final int result = jdbcTemplate.update(
                              "INSERT INTO contents "
                              + "(content, createdAt)" + " VALUES "
                              + "(:content, :createdAt)",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

}
