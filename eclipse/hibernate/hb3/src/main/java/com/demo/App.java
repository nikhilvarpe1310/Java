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
       
     Product p = session.createQuery("from Product where id=:a",Product.class)
       .setParameter("a", 50)
       .uniqueResult();
       System.out.println(p);
       
       tx.commit();
       
       
      
    }
}
