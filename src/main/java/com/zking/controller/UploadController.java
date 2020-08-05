package com.zking.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class UploadController {


    @RequestMapping("/upload")
    @RequiresRoles(value = "管理员")
    public String upload(MultipartFile MultipartFile) throws Exception{

        String updatename = MultipartFile.getOriginalFilename();
        File file  = new File("F:\\迅雷下载\\"+updatename);
        MultipartFile.transferTo(file);

        System.out.println("已执行文件上传!");

        return "upload";
    }


    @RequestMapping("/toupload")
    public String toupload(){

        System.out.println("进入toupload");

        return "upload";
    }


}
