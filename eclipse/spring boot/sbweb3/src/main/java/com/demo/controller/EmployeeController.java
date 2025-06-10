package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	
	@GetMapping(value = "/")
	public ModelAndView m1(ModelAndView m)
	{
		m.addObject("employees",es.findAll()); 
		m.setViewName("index.jsp");
		return m;
	}
	
	@GetMapping(value = "/req1")
	public ModelAndView m2(String t1,ModelAndView m)
	{
		List<Employee> list = es.findByAny(t1);
		if(list.isEmpty())
			m.addObject("msg","record not found");
		m.addObject("employees",es.findByAny(t1)); 
		m.setViewName("index.jsp");
		return m;
	}
	
	@GetMapping(value = "/req2")
	public ModelAndView m3(ModelAndView m,Employee e,String b1)
	{
		if(b1.equalsIgnoreCase("add"))
		{
			if(e.getName().isBlank() || e.getDesignation().isBlank() || e.getCompany().isBlank() || e.getSalary()==0)
			{
				m.addObject("msg","please add all information");
				m1(m);
			}else
			{
			e = es.save(e);
			if(e!=null)
				m.addObject("msg","record inserted successfully");
			else
				m.addObject("msg","record not inserted successfully");
			m1(m);
			}
		}
		if(b1.equalsIgnoreCase("delete"))
		{
			int result = es.deleteById(e.getId());
			if(result==0)
				m.addObject("msg","record not found");
			else
				m.addObject("msg","record deleted succesfully");
			m1(m);
		}
		if(b1.equalsIgnoreCase("display"))
		{
			e = es.findById(e.getId());
			if(e==null)
			{
				m.addObject("msg","record not found");
				m1(m);
			}else
			{
				m.addObject("employee",e);
				m.setViewName("first.jsp");
			}
		}
		if(b1.equalsIgnoreCase("update"))
		{
			es.save(e);
			m.addObject("msg","Record updated Succesfully");
			m1(m);
		}
		return m;
	}

	}

