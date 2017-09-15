package com.alimy.sbmb.entity;

import java.util.List;

public class Teacher {
    private String teacherId;

    private String teacherName;

    private Short teacherAge;
    
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Short getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Short teacherAge) {
        this.teacherAge = teacherAge;
    }
}