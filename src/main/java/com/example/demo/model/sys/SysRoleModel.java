package com.example.demo.model.sys;

import lombok.Data;

import java.util.Set;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 11:02
 */
@Data
public class SysRoleModel {

    private String id;

    private String roleName; //角色名

    private Set<SysPermissionModel> permissions;  //拥有权限
}
