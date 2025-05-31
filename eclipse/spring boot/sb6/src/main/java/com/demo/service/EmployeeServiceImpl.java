package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao ed;
	
	
	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}


	@Override
	public Employee findById(int id) {
		return ed.findById(id);
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
	public List<Employee> findByIdLessThan(int id) {
		return ed.findByIdLessThan(id);
	}


	@Override
	public List<Employee> findByIdBetween(int low, int high) {
		return ed.findByIdBetween(low, high);
	}


	@Override
	public List<Employee> findByIdNotBetween(int low, int high) {
		return ed.findByIdNotBetween(low, high);
	}


	@Override
	public List<String> findAllNames() {
		return ed.findAllNames();
	}


	@Override
	public List<String> findAllDesignations() {
		return ed.findAllDesignations();
	}


	@Override
	public List<Employee> findByAny(String s1) {
		return ed.findByAny(s1);
	}


	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}


	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}

}
