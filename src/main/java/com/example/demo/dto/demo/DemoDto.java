package com.example.demo.dto.demo;

import com.example.demo.dto.page.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/26 15:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DemoDto extends PageRequest {

    @ApiModelProperty("id")
    private String id;
    @ApiModelProperty("响应码")
    private String code;
    @ApiModelProperty("响应码翻译")
    private String codeName;
}
