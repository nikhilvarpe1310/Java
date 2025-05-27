package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@SpringBootApplication
public class Sb3Application {

	public static void main(String[] args) {
			ApplicationContext context = SpringApplication.run(Sb3Application.class, args);
			EmployeeDao ed = context.getBean(EmployeeDao.class);
			
			Employee e = ed.findEmployeeById(2);
			e.setName("Amar Deshmukh");
			System.out.println(ed.updateEmployee(e));
	}

}
