package com.penguin.learn.learnspringboot.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@Component
public class ListenerTest implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器初始化...");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
