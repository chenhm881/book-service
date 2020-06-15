package com.heiio.book.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

//@Component
//public class MyRedis {
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    public void setRedisValue() {
//
//        stringRedisTemplate.opsForValue().append("myRedis", "value");
//    }
//}
