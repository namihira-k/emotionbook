/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.integration.dao;

import org.springframework.beans.factory.annotation.Autowired;
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

    public int insert(final ContentDto dto){
        final int result = jdbcTemplate.update(
                              "INSERT INTO Contents "
                              + "(content, datetime)" + " VALUES "
                              + "(:content, :datetime)",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

}
