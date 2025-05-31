package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	List<Employee>findAll();
	
	Employee findById(int id);
	
	List<Employee>findByNameContains(String name);
	
	Employee findByIdAndName(int id,String name);
	
	List<Employee>findByIdOrName(int id,String name);
	
	List<Employee>findByIdLessThan(int id);
	
	List<Employee>findByIdBetween(int low,int high);
	
	@Query(value = "from Employee where id not between :a and :b")
	List<Employee>findByIdNotBetween(@Param("a") int low,@Param("b") int high);
	
	@Query(value = "select name from Employee",nativeQuery = true)
	List<String> findAllNames();
	
	@Query(value = "select designation from Employee",nativeQuery = true)
	List<String> findAllDesignations();
	
	@Query(value = "select id,name,designation,company,salary from Employee where id like %?1% or name like %?1% or designation like %?1% or company like %?1% or salary like %?1%",nativeQuery = true)
	List<Employee> findByAny(String s1);

	@Query(value = "delete from Employee where id=:a")
	@Modifying 
	int deleteById(@Param("a") int id);
	
	Employee save(Employee e);  //save or update
	
	
	
	

}
