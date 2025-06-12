package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public List<Student> findAll() {
		return sd.findAll();
	}

	@Override
	public byte[] findImageById(int id) {
		return sd.findImageById(id);
	}

	@Override
	public byte[] findDocumentById(int id) {
		return sd.findDocumentById(id);
	}

	@Override
	public int deleteById(int id) {
		return sd.deleteById(id);
	}

	@Override
	public Student findById(int id) {
		return sd.findById(id);
	}
	
}
