/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * post controller
 */
@Controller
public class PostViewController extends AbstractViewController {

    @RequestMapping(value = "/post", method = GET)
    public String get() {
        return "post/body";
    }

}
