/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * login controller
 */
@Controller
@RequestMapping(value = LoginViewController.BASE_URL)
public class LoginViewController extends AbstractViewController {

    protected final static String BASE_URL = AbstractViewController.BASE_URL + "/login";

    @RequestMapping(method = GET)
    public String get() {
        return "login/body";
    }

}
