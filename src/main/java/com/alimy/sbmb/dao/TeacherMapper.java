package com.alimy.sbmb.dao;

import java.util.List;

import com.alimy.sbmb.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    
    List<Teacher> listTeaAndStu();
    
}