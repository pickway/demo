package com.example.demo.enums;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2019/12/30 15:47
 */
public enum ResponseCode {

    SUCCESS("200", "成功"),
    ERROR("500", "失败");

    private String code;
    private String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
