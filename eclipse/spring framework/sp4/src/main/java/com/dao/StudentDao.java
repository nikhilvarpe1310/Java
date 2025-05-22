package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	int insertStudent(Student s);
	
	List<Student> findAllStudent();

}
