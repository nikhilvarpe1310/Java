package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee>findAll();
	
	Employee findById(int id);
	
	List<Employee>findByNameContains(String name);
	
	Employee findByIdAndName(int id,String name);
	
	List<Employee>findByIdOrName(int id,String name);
	
	List<Employee>findByIdLessThan(int id);
	
	List<Employee>findByIdBetween(int low,int high);
	
	List<Employee>findByIdNotBetween(int low,int high);
	
	List<String> findAllNames();
	
	List<String> findAllDesignations();
	
	List<Employee> findByAny(String s1);
	
	int deleteById(@Param("a") int id);
	
	Employee save(Employee e); 

}
