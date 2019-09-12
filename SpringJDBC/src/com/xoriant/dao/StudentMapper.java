package com.xoriant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xoriant.dto.*;

public class StudentMapper implements RowMapper<Student>{
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
		Student student = new Student();
		student.setRollNo(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		
		return student;
	}

}
