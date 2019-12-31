package com.example.demo.mapper;

import com.example.demo.model.sys.SysUserModel;
import org.springframework.stereotype.Repository;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 10:57
 */
@Repository
public interface SysUserMapper {

    SysUserModel findByNickName(String nickName);

    SysUserModel findById(String id);
}
