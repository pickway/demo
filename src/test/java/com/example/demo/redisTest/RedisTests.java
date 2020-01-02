package com.example.demo.redisTest;

import com.example.demo.entity.sys.SysUserEntity;
import com.example.demo.utils.ObjUtil;
import com.example.demo.utils.UUIDUtil;
import com.example.demo.utils.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: Weidong
 * @Description:
 * @Date 2020/1/2 16:01
 */
@Slf4j
@SpringBootTest
class RedisTests {

    @Resource
    private RedisUtil redisUtil;

    @Test
    void redisSet() {
        redisUtil.set("test", "测试");
    }

    @Test
    void redisGet() {
        System.out.println(redisUtil.get("test"));
    }

    @Test
    void redisMsetPo() {
        SysUserEntity user = new SysUserEntity();
        user.setId(UUIDUtil.UUID());
        user.setName("测试");
        try {
            redisUtil.hmset("user", ObjUtil.objToMap(user));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    void redisMgetPo() {
        System.out.println(redisUtil.hmget("user"));
    }

    @Test
    void redisHsetPo() {
        redisUtil.hset("user", "name", "修改测试");
        System.out.println(redisUtil.hmget("user"));
    }

}
