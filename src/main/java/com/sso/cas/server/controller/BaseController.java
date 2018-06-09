package com.sso.cas.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/*
 *
 * 控制器父类
 * @Author luo jiajia
 * @Date 2018/6/9 0009 上午 11:33
 */
public abstract class BaseController {

    @RequestMapping("index")
    public String index(){

        return "index";
    }
}
