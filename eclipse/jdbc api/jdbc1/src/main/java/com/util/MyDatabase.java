package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class MyDatabase {
	
	public static Connection createConnection()
	{
		 Connection con = null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap77", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		 return con;
	}
	
	

			public static List<Student> studentRowMapper(ResultSet rs) throws SQLException
			{
				List<Student> list = new ArrayList();
				while(rs.next())
				{
					Student s1 = new Student();
					s1.setId(rs.getInt("id"));
					s1.setName(rs.getString("name"));
					s1.setCity(rs.getString("city"));
					s1.setPercentage(rs.getDouble("percentage"));
					list.add(s1);
				}
				return list;
				
			}
		
			
}
