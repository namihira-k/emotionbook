/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * abstract api controller
 */
@Controller
@RequestMapping(value = AbstractApiController.BASE_PATH)
public abstract class AbstractApiController {

    protected final static String BASE_PATH = "/api";

}
