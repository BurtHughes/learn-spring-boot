package com.penguin.learn.learnspringboot.web;

import com.penguin.learn.learnspringboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("fastjson")
public class FastJsonController {

    @RequestMapping("/test")
    @ResponseBody
    public User test(){
        User user = new User();

        user.setId(1);
        user.setBirthday(new Date());
        user.setPassword("jack123");
        user.setUsername("jack");

        return user;
    }
}
