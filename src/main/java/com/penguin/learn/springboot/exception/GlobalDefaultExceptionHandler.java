package com.penguin.learn.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    /**
     * 处理Exception类型的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> defaultExceptionHandler(Exception e){
        Map<String,Object> map = new HashMap();
        map.put("code", 500);
        map.put("msg", e.getMessage());
        return map;
    }
}
