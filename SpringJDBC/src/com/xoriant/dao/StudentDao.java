package com.xoriant.dao;

import java.util.List;

import com.xoriant.dto.Student;

public interface StudentDao {
	
	public void addStudent(Student student);
	
	public Student getStudent(Integer id);
	
	public List<Student> listStudent();
	
	public void delete(Integer id);
	
	public void update(Integer id, Integer age);

}
