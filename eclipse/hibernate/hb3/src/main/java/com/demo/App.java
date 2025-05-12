package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Gift;
import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
      
    	   Gift g = session.get(Gift.class,17);
    	   System.out.println(g.getStudent());
    	   System.out.println(g.getStudent().getLaptop());
    	   
    	   
    	 
      
       tx.commit();
    		      
    }
    
 }
