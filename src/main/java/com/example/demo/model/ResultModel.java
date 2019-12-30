package com.example.demo.model;

import com.example.demo.enums.ResponseCode;
import lombok.Data;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/30 15:31
 */
@Data
public class ResultModel<T> {

    private String code;

    private String msg;

    private T data;

    public ResultModel(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultModel(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultModel success() {
        return new ResultModel(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getCode());
    }

    public static ResultModel success(String msg) {
        return new ResultModel(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ResultModel<T> ofData(T data) {
        return new ResultModel<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), data);
    }

    public static <T> ResultModel<T> success(String msg, T data) {
        return new ResultModel<>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static ResultModel error() {
        return new ResultModel(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
    }

    public static ResultModel error(String msg) {
        return new ResultModel(ResponseCode.ERROR.getCode(), msg);
    }
}
