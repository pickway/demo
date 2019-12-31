package com.example.demo.model.sys;

import lombok.Data;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 11:03
 */
@Data
public class SysPermissionModel {

    private String id;

    private String name;  //权限名称

    private String url;   //权限url
}
