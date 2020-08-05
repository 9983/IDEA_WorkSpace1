package com.zking.controller;


import com.zking.model.News;
import com.zking.service.INewsMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private INewsMapperService INewsMapperService;

    //请求方法
    @RequestMapping("/hello")
    public String hello(String name,String pwd){

        System.out.println("Hello Spring-Web"+name+"----"+pwd);

        return "a";
    }

    //非请求方法，在请求方法前运行
    @ModelAttribute
    public void toHello(Model model){

        System.out.println("我先走");
        model.addAttribute("hhh","我是哈哈哈");

    }


    @RequestMapping("/")
    public String index(){

     return "login";
    }

    @RequestMapping("/add")
    @ResponseBody//Json化返回，不会执行跳转
    public String add(Model model, @Validated News News, BindingResult bindingResult){


        System.out.println(News);

        if(bindingResult.hasErrors()){
            System.out.println("新闻标题为空!");
        }

      /*  if(!"".equals(News)){

            int i = INewsMapperService.Add(News);
            if(i >0 ){
                model.addAttribute("msg","增加成功！");
            }else{

                model.addAttribute("msg","增加失败!");
            }

        }else{

            model.addAttribute("msg","news为空!");
        }*/




        return "add";
    }






}
