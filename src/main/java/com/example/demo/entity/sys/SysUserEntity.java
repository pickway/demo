package com.example.demo.entity.sys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/31 9:27
 */
@Entity
@Data
@Table(name = "SYS_USER")
public class SysUserEntity {

    @Id
    private String id;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column
    private String name;

    @Column
    private String password;
}
