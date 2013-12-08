package com.wzj.test.mybatis.mysql.dao;

import java.util.List;

import com.wzj.test.mybatis.mysql.entity.Student;

public interface StudentDao {
    public void addStudents(List<Student> student);
    
    public void updateStudent(Student student);
    
    public List<Student> getStudents(List<String> IDs);
    
    public void deleteStudents(List<String> IDs);
}
