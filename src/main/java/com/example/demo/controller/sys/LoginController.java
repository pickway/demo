package com.example.demo.controller.sys;

import com.example.demo.model.ResultModel;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 17:06
 */
@RestController
public class LoginController {

    @RequestMapping("/logout")
    public ResultModel logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }
        return ResultModel.success("退出成功!");
    }

    @RequestMapping("/unLogin")
    public ResultModel unLogin() {
        return ResultModel.error("未登录!");
    }

    @RequestMapping("/error/unAuth")
    public ResultModel unAuth(){
        return ResultModel.error("暂无权限!");
    }
}
