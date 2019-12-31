package com.example.demo.realm;

import com.example.demo.model.sys.SysPermissionModel;
import com.example.demo.model.sys.SysRoleModel;
import com.example.demo.model.sys.SysUserModel;
import com.example.demo.service.SysLoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 14:29
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Resource
    private SysLoginService sysLoginService;

    /**
     * 用户授权
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principalCollection) {

        log.info("===执行授权===");

        Subject subject = SecurityUtils.getSubject();
        SysUserModel user = (SysUserModel) subject.getPrincipal();
        if(user != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 角色与权限字符串集合
            Set<String> rolesCollection = new HashSet<>();
            Set<String> premissionCollection = new HashSet<>();
            // 读取并赋值用户角色与权限
            Set<SysRoleModel> roles = user.getRoles();
            for(SysRoleModel role : roles){
                rolesCollection.add(role.getRoleName());
                Set<SysPermissionModel> permissions = role.getPermissions();
                for (SysPermissionModel permission : permissions){
                    premissionCollection.add(permission.getUrl());
                }
                info.addStringPermissions(premissionCollection);
            }
            info.addRoles(rolesCollection);
            return info;
        }
        return null;
    }

    /**
     * 用户认证
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("===执行认证===");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        SysUserModel bean = sysLoginService.findByNickName(token.getUsername(),"");
        if(bean == null){
            throw new UnknownAccountException();
        }
        ByteSource credentialsSalt = ByteSource.Util.bytes(bean.getNickName());
        return new SimpleAuthenticationInfo(bean, bean.getPassword(),
                credentialsSalt, getName());
    }

    // 模拟Shiro用户加密，假设用户密码为123456
    public static void main(String[] args){
        // 用户名
        String username = "plus";
        // 用户密码
        String password = "123123";
        // 加密方式
        String hashAlgorithName = "MD5";
        // 加密次数
        int hashIterations = 1024;
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        Object obj = new SimpleHash(hashAlgorithName, password,
                credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}
