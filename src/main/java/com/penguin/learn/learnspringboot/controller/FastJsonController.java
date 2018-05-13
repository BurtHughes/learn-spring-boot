package com.penguin.learn.learnspringboot.controller;

import com.penguin.learn.learnspringboot.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "FastJson测试", tags = { "测试接口" })
@RestController
@RequestMapping("fastjson")
public class FastJsonController {

    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
    @RequestMapping("/test/{name}")
    @ResponseBody
    @CrossOrigin(origins = "http://127.0.0.1:8080")
    public User test(@PathVariable("name") String name){
        User user = new User();

        user.setId(1);
        user.setBirthday(new Date());
        user.setPassword("jack123");
        user.setUsername(name);

        //模拟异常
//        int i = 1/0;
        return user;
    }
}
