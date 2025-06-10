package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.config.HBUtils;
import com.model.Student;

public class StudentDao {
	
	private Session session = HBUtils.sf.openSession();
	private Transaction tx = session.beginTransaction();
	
	private void closeConnection() {
		tx.commit();
		session.close();
	}
	
	
	public int insertStudent(Student s)
	{
		int check = (int) session.save(s);
		closeConnection();
		return check;
	}
	
	public int deleteStudentById(int id)
	{
		int check = session.createQuery("delete from Student where id=:a")
				.setParameter("a", id)
				.executeUpdate();
		closeConnection();
		return check; 
	}
	
	public List<Student> findAllStudent()
	{
		return session.createCriteria(Student.class).list();
	}
	
	public Student findStudentById(int id)
	{
		return session.get(Student.class, id);
	}
	
	public void updateStudent(Student s)
	{
		session.saveOrUpdate(s);
		closeConnection();
	}
	
	public byte[] findImageById(int id)
	{
		return (byte[]) session.createCriteria(Student.class)
				.add(Restrictions.eq("id", id))
				.setProjection(Projections.property("image"))
				.uniqueResult();
	}
	
	public byte[] findDocsById(int id)
	{
		return (byte[]) session.createCriteria(Student.class)
				.add(Restrictions.eq("id", id))
				.setProjection(Projections.property("docs"))
				.uniqueResult();
	}

}
