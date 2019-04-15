package org.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @create 2019-04-14 0:32
 */

@Service
public class PersonService {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private RedisTemplate redisTemplate;

    public void setKey(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value);

//        redisTemplate.opsForValue().set();

    }

    public String getKey(String key){
        return stringRedisTemplate.opsForValue().get(key)+" aac";
    }



}