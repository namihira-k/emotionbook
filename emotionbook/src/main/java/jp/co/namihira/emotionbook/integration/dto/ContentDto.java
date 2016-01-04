/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.integration.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class ContentDto {
    private int id;
    private String content;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime datetime;
}