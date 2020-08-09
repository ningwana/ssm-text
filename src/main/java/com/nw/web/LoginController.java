package com.nw.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    /**
     * 进来的链接都进入login.jsp页面
     * @return
     */
    @RequestMapping(value = "/")
    public String gologin() {
        System.out.println("进入gologin方法");
        return "login";
    }

    /**
     * 登录方法
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, Model model, boolean rememberme) {
        System.out.println("rememberme："+rememberme);
        // 1.使用shiro登录验证，获取subject对象
        Subject subject = SecurityUtils.getSubject();
        // 2.将登录表单封账成token对象
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        rememberme = true? rememberme : false;
        token.setRememberMe(rememberme);
        String error = null;
        try {
            // 3.给shiro框架去认证
            subject.login(token);
        } catch (UnknownAccountException | IncorrectCredentialsException e) {
            error = "用户名/密码错误" + e.getMessage();
        } catch (AuthenticationException e) {
            //其他错误，比如锁定，如果想单独处理请单独catch处理
            error = "其他错误：" + e.getMessage();
        }

        if(error != null) {//出错了，返回登录页面
            model.addAttribute("error", error);
            return "login";
        }
        return "redirect:/book/list";
    }
}