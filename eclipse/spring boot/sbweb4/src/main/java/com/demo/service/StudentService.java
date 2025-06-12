package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {
	
	Student save(Student s);//insert and update
	
	List<Student> findAll();
	
	byte[] findImageById(int id);
	
	byte[] findDocumentById(int id);
	
	int deleteById(int id);
	
	Student findById(int id);

}
