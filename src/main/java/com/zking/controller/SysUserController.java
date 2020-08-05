package com.zking.controller;

import com.zking.model.SysUser;
import com.zking.service.ISysUserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SysUser")
public class SysUserController {

    @Autowired
    private ISysUserMapper ISysUserMapper;





    @RequestMapping("/userlogin")
    public String userlogin(SysUser SysUser, Model model){

        SysUser userlogin = ISysUserMapper.userlogin(SysUser.getUsername());

        //1.拿到Shiro主体对象
        Subject subject = SecurityUtils.getSubject();

        //2.将用户传过来的账号封装到令牌中
        UsernamePasswordToken token = new UsernamePasswordToken(
                SysUser.getUsername(),
                SysUser.getPassword()
        );


        //3.验证
        String msg = null;

        try {
            subject.login(token);
        } catch (AccountException e) {
            msg = "账号输入有误！";
        } catch (IncorrectCredentialsException e){
            msg = "密码输入有误！";
        } catch (Exception e){
            msg = "错误!";
        }
        System.out.println(token.toString());
        if(msg == null){
             return "index";

        }else{
            model.addAttribute("msg",msg);
             return "login";
        }


    }
}
