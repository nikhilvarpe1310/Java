package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao ed;

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}

	@Override
	public Employee findById(int id) {
		return ed.findById(id);
	}

	@Override
	public List<Employee> findByCompany(String company) {
		return ed.findByCompany(company);
	}

	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	public List<Employee> findBySalary(double salary) {
		return ed.findBySalary(salary);
	}

	@Override
	public List<Employee> findBySalaryLessThan(double salary) {
		return ed.findBySalaryLessThan(salary);
	}

	@Override
	public List<Employee> findBySalaryBetween(double low, double high) {
		return ed.findBySalaryBetween(low, high);
	}

	@Override
	public List<Employee> findBySalaryIn(List<Double> list) {
		return ed.findBySalaryIn(list);
	}

	@Override
	public List<Employee> findByNameStartsWith(String name) {
		return ed.findByNameStartsWith(name);
	}

	@Override
	public List<Employee> findByNameEndsWith(String name) {
		return ed.findByNameEndsWith(name);
	}

	@Override
	public List<Employee> findByNameContains(String name) {
		return ed.findByNameContains(name);
	}

	@Override
	public Employee findByIdAndName(int id, String name) {
		return ed.findByIdAndName(id, name);
	}

	@Override
	public List<Employee> findByIdOrName(int id, String name) {
		return ed.findByIdOrName(id, name);
	}

	@Override
	public List<Employee> findByNotId(int id) {
		return ed.findByNotId(id);
	}

	@Override
	public List<Employee> m1(int id) {
		return ed.m1(id);
	}

	@Override
	public Employee m2(int id) {
		return ed.m2(id);
	}

	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}

	
	
	

}
