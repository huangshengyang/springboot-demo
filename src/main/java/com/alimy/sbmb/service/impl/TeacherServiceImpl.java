package com.alimy.sbmb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimy.sbmb.dao.TeacherMapper;
import com.alimy.sbmb.entity.Teacher;
import com.alimy.sbmb.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
    
    @Autowired
    private TeacherMapper teacherMapper;
    
    public List<Teacher> listTeaAndStu() {
        List<Teacher> list = teacherMapper.listTeaAndStu();
        return list;
    }
    
    
    
}
