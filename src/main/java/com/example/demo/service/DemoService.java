package com.example.demo.service;

import com.example.demo.dto.demo.DemoDto;
import com.example.demo.entity.DemoEntity;

import java.util.List;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/25 15:53
 */
public interface DemoService {
    List<DemoEntity> demo();

    List<DemoEntity> pageHelper(DemoDto demoDto);
}
