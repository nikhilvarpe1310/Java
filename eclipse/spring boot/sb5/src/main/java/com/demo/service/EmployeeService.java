package com.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee e);
	
	Employee findById(int id);

	List<Employee> findByCompany(String company);
	
	List<Employee> findAll();
	
	List<Employee> findBySalary(double salary);
	
	List<Employee> findBySalaryLessThan(double salary);
	
	List<Employee> findBySalaryBetween(double low,double high);
	
	List<Employee> findBySalaryIn(List<Double> list);
	
	List<Employee> findByNameStartsWith(String name);
	
	List<Employee> findByNameEndsWith(String name);
	
	List<Employee> findByNameContains(String name);
	
	Employee findByIdAndName(int id,String name);
	
	List<Employee> findByIdOrName(int id,String name);
	
	List<Employee> findByNotId(int id);
	
	@Query(value = "select id,name,designation,company,salary from Employee where id=?1",nativeQuery = true)
	List<Employee> m1(int id);
	
	@Query(value = " select\r\n"
			+ "        id,\r\n"
			+ "        name,\r\n"
			+ "        designation,\r\n"
			+ "        company,\r\n"
			+ "        salary \r\n"
			+ "    from\r\n"
			+ "        Employee \r\n"
			+ "    where\r\n"
			+ "        id=?1",nativeQuery = true)
	Employee m2(int id);
	
	@Query(value="delete from Employee where id=:a")
	int deleteById(@Param("a") int id);
}
