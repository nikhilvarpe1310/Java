package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao sd = context.getBean(StudentDao.class);
        
       List<Student> list = sd.findAllStudent();
       for(Student s:list)
    	   System.out.println(s);
        
    }
}
