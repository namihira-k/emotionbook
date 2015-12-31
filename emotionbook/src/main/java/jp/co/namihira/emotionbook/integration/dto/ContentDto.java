/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.integration.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ContentDto {
    private int id;
    private String content;
    private LocalDateTime datetime;
}