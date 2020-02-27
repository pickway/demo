package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication demoApplication = new SpringApplication(DemoApplication.class);
        demoApplication.setBannerMode(Banner.Mode.OFF);
        demoApplication.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }
}
