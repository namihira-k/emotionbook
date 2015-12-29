/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * user setting controller
 */
@Controller
public class UserSettingViewController extends AbstractViewController {

    @RequestMapping(value = "/usersetting", method = GET)
    public String get() {
        return "usersetting/body";
    }

}
