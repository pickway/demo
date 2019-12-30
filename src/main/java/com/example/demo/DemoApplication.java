package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication demoApplication = new SpringApplication(DemoApplication.class);
        demoApplication.setBannerMode(Banner.Mode.OFF);
        demoApplication.run(args);
    }

}
