package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service 
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao sd;

	@Override
	public int insertStudent(Student s) { 
		return sd.insertStudent(s);
	}

	@Override
	public List<Student> findAllStudent() {
		return sd.findAllStudent();
	}

}
