package com.wzj.test.mybatis.mysql.dao; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzj.test.mybatis.mysql.entity.StudentBean;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class StudentDaoSpringTest {
	@Resource(name="studentDao")
	private StudentDao studentMapper;
	
	@Resource(name="studentDaoImpl")
	private StudentDaoImpl studentDaoImpl;
	
	@Test
	public void testUpdateStudent()
	{
		StudentBean studentBean = getStudent(1432);
		studentBean.setDescription("The student is good.");
		studentMapper.updateStudent(studentBean);
	}
    
	private StudentBean getStudent(int ID)
	{
		StudentBean student = new StudentBean();
		student.setID(ID);
		
		return student;
	}
    private List<StudentBean> getStudents() {
        List<StudentBean> students = new ArrayList<StudentBean>();
        StudentBean student = new StudentBean();
        
        student.setDescription("the student is good.");
        student.setEntranceDate(new Date());
        student.setID(1432);
        student.setMajor("communication engeneer");
        student.setName("wangzhijiang");
        student.setSex("male");
        student.setTel("13735846471");
        
        students.add(student);
        
        return students;
    }
    
    @Test
    public void test()
    {
    	StudentBean studentBean = getStudent(1432);
		studentBean.setDescription("The student is bad.");
    	
    	studentDaoImpl.updateStudent(studentBean);
    }
}
