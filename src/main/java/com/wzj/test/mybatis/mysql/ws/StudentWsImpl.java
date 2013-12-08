package com.wzj.test.mybatis.mysql.ws;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.wzj.test.mybatis.mysql.entity.StudentBean;
import com.wzj.test.mybatis.mysql.service.StudentService;

@Service("studentWsImpl")
@WebService
public class StudentWsImpl implements StudentWs{
	@Resource(name="studentServiceImpl")
	private StudentService studentService;

	@Override
	public void addStudents(List<StudentBean> student) {
		// TODO Auto-generated method stub
		studentService.addStudents(student);
	}

	@Override
	public void updateStudent(StudentBean student) {
		// TODO Auto-generated method stub
		studentService.updateStudent(student);
	}

	@Override
	public List<StudentBean> getStudents(List<String> IDs) {
		// TODO Auto-generated method stub
		return studentService.getStudents(IDs);
	}

	@Override
	public void deleteStudents(List<String> IDs) {
		// TODO Auto-generated method stub
		studentService.deleteStudents(IDs);
	}

}
