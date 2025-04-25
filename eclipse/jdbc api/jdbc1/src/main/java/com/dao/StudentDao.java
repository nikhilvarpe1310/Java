package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.MyDatabase;

public class StudentDao {
	public int insertStudent(Student s)
	{
		int check = 0;
		Connection con = MyDatabase.createConnection();
		String sql = "insert into student(name,city,percentage)values(?,?,?)";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			check = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
		{
			MyDatabase.closeConnection(pst, con);
		}
			return check;
	}
	
	public int deleteStudentById(int id)
	{
		int check = 0;
		Connection con = MyDatabase.createConnection();
		String sql = "delete from student where id=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			check = pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			MyDatabase.closeConnection(pst, con);
		}
		return check;
	}
	
	public Student findStudentById(int id)
	{
		Student s = null;
		Connection con =MyDatabase.createConnection();
		String sql = "select id,name,city,percentage from student where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList();
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			list = MyDatabase.studentRowMapper(rs);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			MyDatabase.closeConnection(rs, pst, con);
		}
		
		return (!list.isEmpty())?list.get(0):null;
	}
	
	public List<Student> findAllStudent()
	{
		List<Student> list = new ArrayList();
		Connection con = MyDatabase.createConnection();
		String sql = "select id,name,city,percentage from student";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			list.addAll(MyDatabase.studentRowMapper(rs));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			MyDatabase.closeConnection(rs ,pst, con);
		}
		return list;
	}
		
		public int updateStudent(Student s)
		{
			int check = 0;
			Connection con = MyDatabase.createConnection();
			String sql = "update student set name=?,city=?,percentage=? where id=?";
			PreparedStatement pst = null;
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1, s.getName());
				pst.setString(2, s.getCity());
				pst.setDouble(3, s.getPercentage());
				pst.setInt(4, s.getId());
				check = pst.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally
			{
				MyDatabase.closeConnection(pst, con);
			}
			return check;
		
	}
}