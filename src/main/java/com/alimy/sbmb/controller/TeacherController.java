package com.alimy.sbmb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alimy.sbmb.entity.Teacher;
import com.alimy.sbmb.service.TeacherService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("老师管理")
@RestController
public class TeacherController {
    
    @Autowired
    private TeacherService teacherService;
    
    @ApiOperation("查询全部老师与所教学生列表")
    @RequestMapping(value = "/listTeaStu", method = RequestMethod.GET)
    public List<Teacher> listTeaStu() {
        try {
            List<Teacher> list = teacherService.listTeaAndStu();
            return list;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
