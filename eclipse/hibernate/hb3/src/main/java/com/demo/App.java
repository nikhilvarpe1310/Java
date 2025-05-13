package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Gift;
import com.model.Student;
import com.model.Subject;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
      
      Student s = session.get(Student.class, 1);
      System.out.println("Name of Student:" +s.getName());
      System.out.println("Department:" +s.getDepartment().getName());
      System.out.println("Laptop Given:" +s.getLaptop().getName());
      System.out.println("Achievements:");
      List<Gift> g = s.getGifts();
      for(Gift g1:g)
      {
   	   System.out.println("-" +g1.getName());
      }
      System.out.println("Subjects:");
      List<Subject> s1 = s.getDepartment().getSubjects();
      for(Subject s2:s1)
      {
   	   System.out.println("-" +s2.getName());
      }
       tx.commit();
    		      
    }
    
 }
