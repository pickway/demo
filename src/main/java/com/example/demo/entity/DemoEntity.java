package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/25 15:49
 */
@Entity
@Data
@Table(name = "DEMO")
public class DemoEntity {
    @Id
    private String id;

    @Column
    private String code;

    @Column(name = "code_name")
    private String codeName;
}
