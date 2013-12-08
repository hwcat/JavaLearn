package com.wzj.test.mybatis.mysql.service;

import java.util.List;

import com.wzj.test.mybatis.mysql.entity.StudentBean;

public interface StudentService {
	public void addStudents(List<StudentBean> student);
    
    public void updateStudent(StudentBean student);
    
    public List<StudentBean> getStudents(List<String> IDs);
    
    public void deleteStudents(List<String> IDs);
}
