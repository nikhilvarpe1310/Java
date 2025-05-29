package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;
import java.util.List;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
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
	
	@Query(value = "from Employee where id!=:a")
	List<Employee> findByNotId(@Param("a") int id);
	
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
	@Modifying
	int deleteById(@Param("a") int id);
	
	
	

}
