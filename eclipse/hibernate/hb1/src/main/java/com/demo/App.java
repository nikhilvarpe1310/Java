package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure(); // <- load hibernate.cfg.xml
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Student s1 = new Student();
        s1.setName("ABC");
        s1.setCity("Pune");
        s1.setPercentage(81.55);

        session.save(s1);

        tx.commit();
        session.close();
    }
}
