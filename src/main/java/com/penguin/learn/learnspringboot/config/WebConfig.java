package com.penguin.learn.learnspringboot.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.penguin.learn.learnspringboot.servlet.ServletTest;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class WebConfig {

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

        return new HttpMessageConverters(converter);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new ServletTest(),"/servletTest");
    }
}