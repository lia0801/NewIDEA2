package com.hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@RequestMapping("say")
public class HelloController {

    //注入测试数据库是否连接成功
    @Autowired
    private DataSource dataSource;

    @RequestMapping("hi")
    @ResponseBody
    public String sayHi(){
        System.out.println(dataSource);
        return "say hi";
    }

}
