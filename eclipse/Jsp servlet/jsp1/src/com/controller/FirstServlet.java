package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.dao.StudentDao;
import com.model.Student;

@MultipartConfig(maxFileSize = 999999999,maxRequestSize = 999999999)
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("b1").equalsIgnoreCase("add"))
		{
			Student s = new Student();
			s.setName(req.getParameter("name"));
			s.setCity(req.getParameter("city"));
			s.setPercentage(Double.parseDouble(req.getParameter("percentage")));
			Part file1 = req.getPart("image");
			Part file2 = req.getPart("docs");
			if(file1.getSize() != 0)
			    s.setImage(IOUtils.toByteArray(file1.getInputStream()));

			if(file2.getSize() != 0)
			    s.setDocs(IOUtils.toByteArray(file2.getInputStream()));

			
			int check = new StudentDao().insertStudent(s);
			if(check!=0)
				req.setAttribute("msg", "Record Inserted Succesfully");
			else
				req.setAttribute("msg", "Record is not inserted Succesfully");
				
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		if(req.getParameter("b1").equalsIgnoreCase("delete"))
		{
			int id = Integer.parseInt(req.getParameter("id"));
			int check = new StudentDao().deleteStudentById(id);
			if(check!=0)
				req.setAttribute("msg", "Record Deleted Succesfully...");
			else
				req.setAttribute("msg", "Record  not found...");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		if(req.getParameter("b1").equalsIgnoreCase("display"))
		{
			int id = Integer.parseInt(req.getParameter("id"));
			Student s= new StudentDao().findStudentById(id);
			if(s==null)
			{
				req.setAttribute("msg", "record not found!!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			else
			{
				req.setAttribute("student", s);
				req.getRequestDispatcher("first.jsp").forward(req, resp);
			}
		}
		
		if(req.getParameter("b1").equalsIgnoreCase("update"))
		{
			Student s = new Student();
			s.setId(Integer.parseInt(req.getParameter("id")));
			s.setName(req.getParameter("name"));
			s.setCity(req.getParameter("city"));
			s.setPercentage(Double.parseDouble(req.getParameter("percentage")));
			new StudentDao().updateStudent(s);
			req.setAttribute("msg", "record updated Succesfully");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			 
		}

	}

}//8975540479
