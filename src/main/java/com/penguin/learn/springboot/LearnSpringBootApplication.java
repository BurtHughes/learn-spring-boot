package com.penguin.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication /*implements ServletContextInitializer*/ {

/*
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException{
        //配置Servlet
        servletContext.addServlet("servletTest", new ServletTest()).addMapping("/servletTest");

        //配置过滤器
        servletContext.addFilter("timeFilter", new TimeFilter())
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");

        //配置监听器
        servletContext.addListener(new ListenerTest());
    }
*/

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootApplication.class, args);
    }
}
