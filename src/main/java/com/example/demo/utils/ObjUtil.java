package com.example.demo.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2020/1/2 17:20
 */
public class ObjUtil {

    public static Map<String, Object> objToMap(Object obj) throws IllegalAccessException{
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        return map;
    }
}
