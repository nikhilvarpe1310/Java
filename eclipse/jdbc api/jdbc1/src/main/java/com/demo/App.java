package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	
    	
    	List<Student> list = sd.findAllStudent();
    	for(Student s:list)
    		System.out.println(s);
    	
    	
    }
}
