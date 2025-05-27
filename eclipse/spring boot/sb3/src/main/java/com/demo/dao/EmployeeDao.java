package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	
	int insertEmployee(Employee e);
	
	int deleteEmployeeById(int id);
	
	Employee findEmployeeById(int id);
	
	List<Employee> findAllEmployee();
	
	int updateEmployee(Employee e);

}
