/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.api;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.namihira.emotionbook.integration.dao.ContentsDao;
import jp.co.namihira.emotionbook.integration.dto.ContentDto;

/**
 * content api controller
 */
@RestController
@RequestMapping(value = ContentApiController.BASE_PATH)
public class ContentApiController extends AbstractApiController {

    protected final static String BASE_PATH = AbstractApiController.BASE_PATH + "/contents";

    @Autowired
    private ContentsDao contentsDao;

    @RequestMapping(method = GET)
    public List<ContentDto> get() {
        return contentsDao.selectAll();
    }

    @RequestMapping(method = POST)
    public ContentDto post(@RequestBody ContentDto content) {
        contentsDao.insert(content);
        return content;
    }

}
