package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty("主键id")
    private String id;

    @Column
    @ApiModelProperty("响应码")
    private String code;

    @Column(name = "code_name")
    @ApiModelProperty("响应码中文翻译")
    private String codeName;
}
