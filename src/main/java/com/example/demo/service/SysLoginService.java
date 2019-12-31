package com.example.demo.service;

import com.example.demo.model.ResultModel;
import com.example.demo.model.sys.SysUserModel;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 10:56
 */
public interface SysLoginService {
    SysUserModel findByNickName(String nickName,String password);

    ResultModel login(String nickName, String password);
}
