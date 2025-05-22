package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;
import com.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        
        StudentService ss = context.getBean(StudentService.class);
        
        List<Student> list = ss.findAllStudent();
        for(Student s:list)
        	System.out.println(s);
    }
}
