package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       
       List<Student> list = session.createCriteria(Student.class)
    	.list();
       for(Student s:list)
       {
    	   System.out.println(s.getName()+"\t\t"+s.getLaptop().getName());
       }
      
      
      
       tx.commit();
    		      
    }
    
 }
