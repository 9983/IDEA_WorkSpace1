package com.zking.controller;

import com.zking.model.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Test")
public class TestController {

    @RequestMapping("/toAdd")
    public String Test(Model model){

        System.out.println("我是Test里面的toAdd我要去Add");

        News news = new News();
        news.setNewsId(3);
        news.setTitle("我是新闻标题哈哈哈1");

        model.addAttribute("news",news);

        return "add";
    }




}
