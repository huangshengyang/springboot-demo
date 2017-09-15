package com.alimy.sbmb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alimy.sbmb.entity.Usertab;
import com.alimy.sbmb.service.RedisTestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("springboot整合redis测试")
@RestController
public class RedisTestController {
    
    @Autowired
    private RedisTestService redisTestService;
    
    @ApiOperation("测试redis根据id查找用户")
    @ApiImplicitParam(paramType="path", name="userId", value="用户id", required=true, dataType="String")
    @RequestMapping(value="/queryUserById/{userId}", method=RequestMethod.GET)
    public Usertab queryUserById(@PathVariable String userId) {
        Usertab usertab = this.redisTestService.queryById(userId);
        System.out.println(usertab.toString());
        return usertab;
    }
    
}
