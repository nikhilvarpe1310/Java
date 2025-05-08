package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Product;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       
      List<Product> list =pagination2(session,2);
      	for(Product p:list)
      		System.out.println(p);
       
       tx.commit();
       
      
    }
    
    public static List<Product> pagination2(Session session, int page)
    {
    	int size = 20;
    	return session.createQuery("from Product",Product.class)
    			.setFirstResult((page-1)*size)
    			.setMaxResults(size)
    			.list();
    	
    }
    
    
    
}
