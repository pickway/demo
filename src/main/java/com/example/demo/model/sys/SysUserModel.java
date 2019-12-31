package com.example.demo.model.sys;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 10:59
 */
@Data
public class SysUserModel implements Serializable {
    @Id
    private String id;

    private String nickName;

    private String name;

    private String password;

    private Set<SysRoleModel> roles;
}
