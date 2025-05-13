package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Gift;
import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
      
       int count = 0;
       Department d = session.get(Department.class, 3);
       List<Student> list = d.getStudents();
       for(Student s:list)
       {
    	   List<Gift> g = s.getGifts();
    	   for(Gift g1:g)
    	   System.out.println(g1.getName());
    	   count+=g.size();
    	   
       }
       System.out.println(count);
    	
      
       tx.commit();
    		      
    }
    
 }
