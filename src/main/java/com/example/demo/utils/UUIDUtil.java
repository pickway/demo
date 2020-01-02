package com.example.demo.utils;

import java.util.UUID;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2020/1/2 17:03
 */
public class UUIDUtil {

    public static String UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
