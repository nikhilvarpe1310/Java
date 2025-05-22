package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository 
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	
	public int insertStudent(Student s) {
		return (int) sf.getCurrentSession().save(s);
	}

	@Override
	public List<Student> findAllStudent() {
		return sf.getCurrentSession().createCriteria(Student.class)
				.list();
				
	}

}
