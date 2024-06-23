package com.codesy.blogsystem.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //定义可请求的方法，/**代表所有方法
                .allowedOrigins("*") //定义跨域请求来源
                .allowedMethods("GET", "POST")
                .allowCredentials(true);
    }
}
