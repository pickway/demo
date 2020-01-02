package com.example.demo.service.impl;

import com.example.demo.mapper.SysUserMapper;
import com.example.demo.model.ResultModel;
import com.example.demo.model.sys.SysUserModel;
import com.example.demo.service.SysLoginService;
import com.example.demo.utils.redis.RedisUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 10:56
 */
@Service
public class SysLoginServiceImpl implements SysLoginService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserModel findByNickName(String nickName, String password) {
        SysUserModel user = sysUserMapper.findByNickName(nickName);
        if (user != null) {
            return sysUserMapper.findById(user.getId());
        }
        return null;
    }

    @Override
    public ResultModel login(String nickName, String password) {
        // 获取Subject
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(nickName, password);
        try {
            subject.login(token);
            return ResultModel.ofData((SysUserModel) subject.getPrincipal());
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            return ResultModel.error("用户名不存在！");
        } catch (IncorrectCredentialsException e) {
            return ResultModel.error("密码错误！");
        }
    }
}
