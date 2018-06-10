package com.sso.cas.server.controller;

import com.sso.cas.server.service.CasUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/*
 *
 * cas用户控制器
 * @Author luo jiajia
 * @Date 2018/6/9 0009 上午 11:34
 */
@Controller
@RequestMapping("casUser")
public class CasUserController extends BaseController {
    @Autowired
    private CasUserInterface casUserInterface;

    @RequestMapping("loginPage")
    public String loginPage(HttpServletRequest request){
        request.setAttribute("msg", "这是登录页面！");
        return "login";
    }

}
