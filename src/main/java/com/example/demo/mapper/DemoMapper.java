package com.example.demo.mapper;

import com.example.demo.dto.demo.DemoDto;
import com.example.demo.entity.DemoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/25 15:55
 */
@Repository
public interface DemoMapper {

    List<DemoEntity> demo();

    List<DemoEntity> pageHelper(DemoDto demoDto);
}
