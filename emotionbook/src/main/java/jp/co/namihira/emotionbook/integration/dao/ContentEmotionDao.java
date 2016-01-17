/*
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.integration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.namihira.emotionbook.integration.dto.ContentEmotionDto;

/**
 * Content Emotion Dao
 */
@Repository
public class ContentEmotionDao {

    /** table name */
    private static final String TABLE_NAME = "content_emotion";

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int insert(final ContentEmotionDto dto){
        final int result = jdbcTemplate.update(
                              "INSERT INTO "
                              + TABLE_NAME + " "
                              + "(contentId, emotionTagId)" + " VALUES "
                              + "(:contentId, :emotionTagId)",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

}
