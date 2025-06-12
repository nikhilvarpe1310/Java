package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	Student save(Student s);//insert and update
	
	List<Student> findAll();
	
	@Query(value = "select image from student where id=?1",nativeQuery = true)
	byte[] findImageById(int id);
	
	@Query(value = "select document from student where id=?1",nativeQuery = true)
	byte[] findDocumentById(int id);
	
	@Query(value = "delete from student where id=?1",nativeQuery = true)
	@Modifying
	int deleteById(int id);	
	
	Student findById(int id);

}
