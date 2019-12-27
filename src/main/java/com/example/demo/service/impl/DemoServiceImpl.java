package com.example.demo.service.impl;

import com.example.demo.dto.demo.DemoDto;
import com.example.demo.entity.DemoEntity;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    public List<DemoEntity> demo() {
        return demoMapper.demo();
    }

    @Override
    public List<DemoEntity> pageHelper(DemoDto demoDto) {
        demoDto.initPageHelper();
        return demoMapper.pageHelper(demoDto);
    }
}
