package com.example.demo.dto.page;

import com.example.demo.constants.CommonCons;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/26 14:12
 */
@Data
public class PageRequest {

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("每页大小")
    private Integer pageSize;

    @ApiModelProperty("排序字段")
    private String order;

    @ApiModelProperty(value = "排序方式(asc升序,desc降序,默认升序)", allowableValues = "asc,desc")
    private String sord;

    public PageRequest() {
        this.pageNum = CommonCons.PAGE_NUM_DEFAULT;
        this.pageSize = CommonCons.PAGE_SIZE_DEFAULT;
    }

    public void initPageHelper(){
        PageHelper.startPage(this.pageNum, this.pageSize ,this.order);
    }
}
