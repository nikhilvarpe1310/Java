package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.model.StudentRowMapper;


@Component
public class StudentDao {
	
	@Autowired
	private JdbcTemplate j;

	
	
	public int insertStudent(Student s)
	{
		String sql="insert into student(name,city,percentage) values(?,?,?)";
		return j.update(sql,new Object[] {s.getName(),s.getCity(),s.getPercentage()});
	}
	
	public int deleteStudentById(int id)
	{
		String sql ="delete from student where id=?";
		return j.update(sql,id);
	}
	
	public Student findStudentById(int id)
	{
		String sql = "select id,name,city,percentage from Student where id=?";
		List<Student> list = j.query(sql, new StudentRowMapper(),id);
		return (!list.isEmpty())?list.get(0):null;
	}

	public List<Student> findAllStudent()
	{
		String sql = "select id,name,city,percentage from Student";
		return j.query(sql, new StudentRowMapper());
	}
}
