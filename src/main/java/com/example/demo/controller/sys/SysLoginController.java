package com.example.demo.controller.sys;

import com.example.demo.model.ResultModel;
import com.example.demo.model.sys.SysUserModel;
import com.example.demo.service.SysLoginService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 11:13
 */
@Api(tags = "登录")
@RestController
public class SysLoginController {

    @Resource
    private SysLoginService sysLoginService;

    @PostMapping("/login")
    public ResultModel login(String nickName, String password) {
        return sysLoginService.login(nickName,password);
    }
}
