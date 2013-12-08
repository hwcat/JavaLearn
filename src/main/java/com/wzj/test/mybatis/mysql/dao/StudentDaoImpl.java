package com.wzj.test.mybatis.mysql.dao;


import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.wzj.test.mybatis.mysql.entity.StudentBean;

@Service("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {
	@Resource(name="sqlSession")
	private SqlSessionTemplate sqlSession;
	
    public void updateStudent(StudentBean student) {
        // TODO Auto-generated method stub
    	sqlSession.update("updateStudent", student);
    }

    public List<StudentBean> getStudents(List<String> IDs) {
        // TODO Auto-generated method stub
        return null;
    }

    public void deleteStudents(List<String> IDs) {
        // TODO Auto-generated method stub

    }

    public void addStudents(List<StudentBean> student) {
        // TODO Auto-generated method stub
        
    }

}
