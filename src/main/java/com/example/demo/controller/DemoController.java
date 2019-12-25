package com.example.demo.controller;

import com.example.demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Weidong
 * @Description: demo
 * @Date 2019/12/25 15:35
 */
@RestController
@RequestMapping("/demo")
@Api(value = "demo", tags = "demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public String test() {
        return demoService.demo().toString();
    }
}
