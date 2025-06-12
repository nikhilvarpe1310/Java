package com.demo.controller;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.StudentService;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@MultipartConfig(maxFileSize = 999999999,maxRequestSize = 999999999)
public class StudentController {
	
	@Autowired
	private StudentService ss;
	@GetMapping(value = "/")
	public ModelAndView m1(ModelAndView m)
	{
		m.addObject("listOfStudents",ss.findAll());
		m.setViewName("index.jsp");
		return m;
	}
	
	@PostMapping(value = "/req1")
	public ModelAndView m2(ModelAndView m,int id,String name,String city,double percentage,MultipartFile image,MultipartFile document,String b1) throws IOException
	
	{
		if(b1.equalsIgnoreCase("add"))
		{
			Student s1 = new Student();
			s1.setName(name);
			s1.setCity(city);
			s1.setPercentage(percentage);
			s1.setImage(image.getBytes());
			s1.setDocument(document.getBytes());
			s1 = ss.save(s1);
			if(ss==null)
				m.addObject("msg","record not inserted successfully");
			else
				m.addObject("msg","record  inserted successfully");
			m1(m);
		}
		
		if(b1.equalsIgnoreCase("delete"))
		{
			int result = ss.deleteById(id);
			if(result==0)
				m.addObject("msg","record not found");
			else
				m.addObject("msg","record deleted succesfully");
			m1(m);
		}
		
		if(b1.equalsIgnoreCase("display"))
		{
			Student s1 = ss.findById(id);
			if(s1==null)
			{
				m.addObject("msg","record not found!!");
				m1(m);
			}
			else
			{
				m.addObject("student",s1);
				m.setViewName("first.jsp");
			}
		}
		
		if(b1.equalsIgnoreCase("update"))
		{
			Student s1 = new Student();
			s1.setId(id);
			s1.setName(name);
			s1.setCity(city);
			s1.setPercentage(percentage);
			if(image.getSize()!=0)
				s1.setImage(image.getBytes());
			else
				s1.setImage(ss.findImageById(id));
			
			if(document.getSize()!=0)
				s1.setDocument(document.getBytes());
			else
				s1.setDocument(ss.findDocumentById(id));
			
			s1 = ss.save(s1);
			m.addObject("msg","Record updated successfully");
			m1(m);
		}
		return m;
	}
	
	@GetMapping(value = "/findimage/{id}")
	public void m3(@PathVariable int id,HttpServletResponse res) throws IOException
	{
		byte[] image = ss.findImageById(id);
		OutputStream o1 = res.getOutputStream();
		res.setContentType("image/jpeg");
		o1.write(image);
		o1.flush();
		o1.close();
	}
	
	@GetMapping(value = "/finddocument/{id}")
	public void m4(@PathVariable int id,HttpServletResponse res) throws IOException
	{
		byte[] document = ss.findDocumentById(id);
		OutputStream o1 = res.getOutputStream();
		res.setContentType("application/pdf");
		o1.write(document);
		o1.flush();
		o1.close();
	}

}
