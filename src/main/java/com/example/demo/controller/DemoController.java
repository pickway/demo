package com.example.demo.controller;

import com.example.demo.dto.demo.DemoDto;
import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
        return demoService.demo().get(0).toString();
    }

    @GetMapping("/pageHelper")
    @ApiOperation("分页测试")
    public PageInfo<DemoEntity> pageHelper(DemoDto demoDto) {
        List<DemoEntity> data = demoService.pageHelper(demoDto);
        return new PageInfo<>(data);
    }

}
