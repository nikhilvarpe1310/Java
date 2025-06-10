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

    List<Employee> findAll();

    @Query(value = "SELECT id, name, designation, company, salary FROM Employee " +
                   "WHERE CAST(id AS CHAR) LIKE CONCAT('%', ?1, '%') " +
                   "OR name LIKE CONCAT('%', ?1, '%') " +
                   "OR designation LIKE CONCAT('%', ?1, '%') " +
                   "OR company LIKE CONCAT('%', ?1, '%') " +
                   "OR CAST(salary AS CHAR) LIKE CONCAT('%', ?1, '%')", // Added CAST for salary
           nativeQuery = true)
    List<Employee> findByAny(String s1);
    
    Employee save(Employee e);//insert and update
    
    @Query(value = "delete from Employee where id=:id")
    @Modifying
    int deleteById(@Param("id") int id);

    Employee findById(int id);
}