package com.wzj.test.mybatis.mysql.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzj.test.mybatis.mysql.dao.StudentDao;
import com.wzj.test.mybatis.mysql.entity.StudentBean;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService{
	
	@Resource(name="studentDaoImpl")
	private StudentDao studentDao;
	
	@Override
	public void addStudents(List<StudentBean> student) {
		studentDao.addStudents(student);
	}

	@Override
	public void updateStudent(StudentBean student) {
		studentDao.updateStudent(student);
	}

	@Override
	public List<StudentBean> getStudents(List<String> IDs) {
		return studentDao.getStudents(IDs);
	}

	@Override
	public void deleteStudents(List<String> IDs) {
		studentDao.deleteStudents(IDs);
	}

}
