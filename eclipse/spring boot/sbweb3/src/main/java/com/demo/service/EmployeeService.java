package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	List<Employee> findByAny(String s1);
	
	 Employee save(Employee e);//insert and update
	 
	  int deleteById(@Param("id") int id);
	  
	  Employee findById(int id);
}
