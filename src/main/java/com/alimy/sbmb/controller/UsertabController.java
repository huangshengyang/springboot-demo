package com.alimy.sbmb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alimy.sbmb.entity.Usertab;
import com.alimy.sbmb.service.UsertabService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("用户管理")
@RestController
public class UsertabController {
    
    private static Logger logger = LoggerFactory.getLogger(UsertabController.class);
    
    @Autowired
    private UsertabService usertabService;
    
    @ApiOperation("增加用户")
    @ApiImplicitParam(paramType = "body", name = "userMsg", value = "用户信息", required = true, dataType = "Usertab")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody Usertab usertab){
        logger.info("UsertabController->addUser -> usertab : " + usertab.toString());
        try {
            System.out.println(usertab);
            Integer num = usertabService.addUser(usertab);
            return num.toString();
        } catch(Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            return "出现异常";
        }
        
    }
    
    @ApiOperation("查看全部用户")
    @RequestMapping(value = "/listUser", method = RequestMethod.GET)
    public List<Usertab> listUser() {
        try {
            List<Usertab> list = usertabService.listUser();
            return list;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @ApiOperation("根据id查询用户信息")
    @ApiImplicitParam(paramType="path", name="userId", value="用户id", required=true, dataType="String")
    @RequestMapping(value="/getUserById/{userId}", method=RequestMethod.GET)
    public Usertab getUserById(@PathVariable String userId) {
        try {
            Usertab usertab = this.usertabService.getUserById(userId);
            return usertab;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @ApiOperation("更新用户信息")
    @ApiImplicitParam(paramType="body", name="userMsg", value="用户信息", required=true, dataType="Usertab")
    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public Integer updateUser(@RequestBody Usertab usertab) {
        try {
            int num = this.usertabService.updateUser(usertab);
            return num;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @ApiOperation("删除用户")
    @ApiImplicitParam(paramType="path", name="userId", value="用户id", required=true, dataType="String")
    @RequestMapping(value="/deleteUser/{userId}", method=RequestMethod.DELETE)
    public Integer deleteUser(@PathVariable String userId){
        try {
            int num = this.usertabService.deleteUser(userId);
            return num;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
