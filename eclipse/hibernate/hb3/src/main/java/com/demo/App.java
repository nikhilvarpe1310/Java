package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Product;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
       
       String[] types = {
                                  "Electronics",
                                  "Clothing",
                                  "Books",
                                  "Home & Kitchen",
                                  "Beauty & Personal Care",
                                  "Sports & Outdoors",
                                  "Toys & Games",
                                  "Automotive",
                                  "Health",
                                  "Grocery",
                                  "Furniture",
                                  "Jewelry",
                                  "Office Supplies",
                                  "Pet Supplies",
                                  "Footwear",
                                  "Musical Instruments",
                                  "Garden & Outdoor",
                                  "Tools & Home Improvement",
                                  "Baby Products",
                                  "Industrial & Scientific",
                                  "Mobile Phones & Accessories",
                                  "Computer & Accessories",
                                  "Cameras & Photography",
                                  "Video Games",
                                  "Watches",
                                  "Luggage & Travel Gear",
                                  "Art & Craft Supplies",
                                  "Cleaning Supplies",
                                  "Stationery",
                                  "Lighting & Decor"
       };
 
       	Random r = new Random(); 
       	for(int i=1; i<=10000; i++)
       	{
       		Product p = new Product();
       		StringBuilder sb = new StringBuilder();
       		for(int j=1; j<=15; j++)
       			sb.append((char)(r.nextInt(26)+65));
       		p.setName(sb.toString());
       		p.setType(types[r.nextInt(types.length)]);
       		p.setPrice(r.nextDouble()*1000000);
       		session.save(p);
       	}
      
       
       tx.commit();
       
       
       System.out.println();
    }
}
