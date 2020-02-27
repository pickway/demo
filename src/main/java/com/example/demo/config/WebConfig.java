package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2020/1/3 16:01
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 解决跨域问题
     * 配置的大意就是允许所有请求跨域访问
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE","OPTIONS")
                .maxAge(3600);

    }
}
