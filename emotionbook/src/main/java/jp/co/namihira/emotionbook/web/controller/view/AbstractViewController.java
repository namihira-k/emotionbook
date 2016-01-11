/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.emotionbook.web.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * View関連のコントローラの抽象クラス
 */
@Controller
@RequestMapping(value = AbstractViewController.BASE_URL)
public abstract class AbstractViewController {

    protected final static String BASE_URL = "/view";

}
