package com.wzj.test.mybatis.mysql.dao; 
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.wzj.test.mybatis.mysql.entity.Student;

public class StudentDaoTest {
    @Test
    public void testAdd() throws IOException {
        String resource = "MyBatisConfiguration.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);

        SqlSession session = factory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);

        studentDao.addStudents(getStudents());
        System.out.println("add students success.");
        List<String> IDs = new ArrayList<String>();
        IDs.add("1432");
        List<Student> students = studentDao.getStudents(IDs);
        System.out.println(students.size());

        session.commit();
        session.close();
    }
    
    @Test
    public void testAddBymanul() throws IOException
    {
        String resourcePath = "MyBatisConfiguration.xml";
        Reader reader = Resources.getResourceAsReader(resourcePath);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        
        SqlSession session = factory.openSession();
        session.selectOne("com.wzj.test.mybatis.mysql.dao.StudentDao.addStudents", 
            getStudents());
        
        session.commit();
        session.close();
    }
    @Test
    public void testUpdateStudent() throws IOException
    {
        String resourcePath = "MyBatisConfiguration.xml";
        Reader reader = Resources.getResourceAsReader(resourcePath);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        
        SqlSession session = factory.openSession();
        
        Student student = new Student();
        student.setDescription("He is a bad student.");
        student.setID(1432);
        session.update("updateStudent", student);
        
        session.commit();
        session.close();
    }
    @Test
    public void testUpdateStudentByMapper() throws IOException
    {
        String resourcePath = "MyBatisConfiguration.xml";
        Reader reader = Resources.getResourceAsReader(resourcePath);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        
        SqlSession session = factory.openSession();
        Student student = new Student();
        student.setID(1432);
        student.setDescription("the student is good.");

        StudentDao dao = session.getMapper(StudentDao.class);
        dao.updateStudent(student);
    }

    private List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        Student student = new Student();
        
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
}
