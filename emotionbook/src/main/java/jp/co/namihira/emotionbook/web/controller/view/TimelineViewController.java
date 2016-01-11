/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * timeline controller
 */
@Controller
@RequestMapping(value = TimelineViewController.BASE_URL)
public class TimelineViewController extends AbstractViewController {

    protected final static String BASE_URL = AbstractViewController.BASE_URL + "/timeline";

    @RequestMapping(method = GET)
    public String get() {
        return "timeline/body";
    }

}
