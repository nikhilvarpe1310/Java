package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Product;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       List<Product> list = session.createCriteria(Product.class)
    		   .add(Restrictions.between("price", 1000.0,3000.0))
    		   .list();
       for(Product p:list)
    	   System.out.println(p);
    	   
      
    }
    
 }
