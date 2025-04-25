package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	
    	
    	Student s1 = sd.findStudentById(2);
    	s1.setPercentage(83.78);
    	System.out.println(sd.updateStudent(s1));
    	
    }
}
