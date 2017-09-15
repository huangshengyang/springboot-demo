package com.alimy.sbmb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.alimy.sbmb.config.RedisConfig;
import com.alimy.sbmb.dao.UsertabMapper;
import com.alimy.sbmb.entity.Usertab;
import com.alimy.sbmb.service.RedisTestService;

@Service
public class RedisTestServiceImpl implements RedisTestService{
    
    @Autowired
    private UsertabMapper usertabMapper;
    
    @Autowired
    private RedisTemplate redisTemplate;
    
    @Autowired
    private RedisConfig redisConfig;
    
    public Usertab queryById(String id) {
        Usertab usertab = this.usertabMapper.queryById(id);
        setRedisCacheById(usertab.getUserId(), usertab);
        System.out.println("从数据库取出数据：");
        return usertab;
    }
    
    private boolean setRedisCacheById(String key, Object value) {
        boolean flag = false;
        try {
            ValueOperations operations = redisTemplate.opsForValue();
            operations.set(key, value.toString());
            System.out.println("数据存入redis！");
            flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void deleteRedisCacheById(String id) {
        // TODO Auto-generated method stub
        
    }
    
    
    
}
