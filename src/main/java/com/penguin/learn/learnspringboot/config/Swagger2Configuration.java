package com.penguin.learn.learnspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("api")// 定义组
                .select()// 选择哪些路径和api 会生成document
                .apis(RequestHandlerSelectors.basePackage("com.penguin.learn.learnspringboot.controller"))//拦截包路径
                .paths(PathSelectors.regex("/*/.*"))//拦截的接口路径
                .build()// 创建
                .apiInfo(apiInfo());// 配置说明
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot 之 web 篇")//标题
                .description("Spring Boot Web 相关内容")//描述
                .termsOfServiceUrl("http://www.extlight.com")
                .contact(new Contact("moonlight", "http://www.extlight.com", "809182524@qq.com"))//联系方式
                .version("1.0")//版本
                .build();
    }
}
