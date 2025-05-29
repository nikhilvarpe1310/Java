package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class Sb5Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sb5Application.class, args);
		
		EmployeeService es = context.getBean(EmployeeService.class);
		
		System.out.println(es.deleteById(10));
	}
	

}
