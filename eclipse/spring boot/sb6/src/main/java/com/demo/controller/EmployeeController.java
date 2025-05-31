package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping(value = "/")
	public List<Employee> m1()
	{
		return es.findAll();
	}
	
	@GetMapping(value = "/req1/{id}")
	public Employee m2(@PathVariable int id)
	{
	return es.findById(id);
	}
	
	@GetMapping(value = "/req2/{s1}")
	public List<Employee> m3(@PathVariable String s1)
	{
		return es.findByNameContains(s1);
	}
	
	@GetMapping(value = "/req3/{a}/{s1}")
	public Employee m4(@PathVariable int a,@PathVariable String s1)
	{
		return es.findByIdAndName(a, s1);
	}
	
	@GetMapping(value = "/req4/{a}/{s1}")
	public List<Employee> m5(@PathVariable int a,@PathVariable String s1)
	{
		return es.findByIdOrName(a, s1);
	}
	
	@GetMapping(value = "/req5/{id}")
	public List<Employee> m6(@PathVariable int id)
	{
		return es.findByIdLessThan(id);
	}
	
	@GetMapping(value = "/req6/{low}/{high}")
	public List<Employee> m7(@PathVariable int low,@PathVariable int high)
	{
		return es.findByIdBetween(low,high);
	}
	
	@GetMapping(value = "/req7/{low}/{high}")
	public List<Employee> m8(@PathVariable int low,@PathVariable int high)
	{
		return es.findByIdNotBetween(low,high);
	}
	
	@GetMapping(value = "/req8")
	public List<String> m9()
	{
		return es.findAllNames();
	}
	
	@GetMapping(value = "/req9")
	public Map<String,List> m10()
	{
		Map<String,List> m = new HashMap();
		m.put("list of names",es.findAllNames());
		m.put("list of Designations", es.findAllDesignations());
		return m;
	}
	
	@GetMapping(value = "/req10/{s1}")
	public List<Employee> m11(@PathVariable String s1)
	{
		return es.findByAny(s1);
	}
	
	@DeleteMapping(value = "/req11/{id}")
	public int m12(@PathVariable int id)
	{
	return es.deleteById(id);
	}
	
	
	@PostMapping(value = "/req12")
	public Employee m13(@RequestBody Employee e)
	{
		return es.save(e);
	}
	
	@PutMapping(value = "/req13")
	public Employee m14(@RequestBody Employee e )
	{
		return es.save(e);
	}
	
	
}
