package com.alimy.sbmb.service;

import com.alimy.sbmb.entity.Usertab;

public interface RedisTestService {
    
    public Usertab queryById(String id);
    
    public void deleteRedisCacheById(String id);
    
}
