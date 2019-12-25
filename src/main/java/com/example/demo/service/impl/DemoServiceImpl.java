package com.example.demo.service.impl;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/25 15:53
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public DemoEntity demo() {
        return demoMapper.demo().get(0);
    }
}
