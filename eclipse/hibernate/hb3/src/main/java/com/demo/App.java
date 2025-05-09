package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Product;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       
       Product p = (Product) session.createCriteria(Product.class)
    		   .add(Restrictions.eq("price",session.createCriteria(Product.class)
    		    .add(Restrictions.lt("price", session.createCriteria(Product.class)
    		     .add(Restrictions.lt("price",session.createCriteria(Product.class)
    		      .setProjection(Projections.max("price"))
    		       .uniqueResult()))
    		    .setProjection(Projections.max("price"))
    		     .uniqueResult()))
    		     .setProjection(Projections.max("price"))
    		    .uniqueResult()))
    		    .uniqueResult();

    		System.out.println(p);

    		   
       
     
       		
      
       
      
    }
    
 }
