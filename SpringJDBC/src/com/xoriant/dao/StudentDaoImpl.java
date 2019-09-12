package com.xoriant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.xoriant.dto.Student;


@Component("studentDaoImpl")
public class StudentDaoImpl implements StudentDao{
	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl() {
		System.out.println("Constructor");
	}
	
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate= new JdbcTemplate(datasource);
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addStudent(Student student) {
		String SQL = "insert into Student (name, age) value (?, ?)";
		String name = student.getName();
		int age = student.getAge();
		if(jdbcTemplate.update(SQL, name, age)>0)
			System.out.println("Created Record : "+name+" "+age);
		
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL = "Select * from Student where id = ?";
		Student student= jdbcTemplate.queryForObject(SQL, new Object[] {id}, new StudentMapper());
		
		return student
				;
	}

	@Override
	public List<Student> listStudent() {
		String SQL ="select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}
	
//	@Override
//	public List<Student> listStudent() {
//		return jdbcTemplate.query("select * from Student", new ResultSetExtractor<List<Student>>(){
//
//			@Override
//			public List<Student> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
//				List<Student> list = new ArrayList<Student>();
//				while(resultSet.next()) {
//					Student student = new Student();
//					student.setRollNo(resultSet.getInt(1));
//					student.setName(resultSet.getString(2));
//					student.setAge(resultSet.getInt(3));
//					list.add(student);
//				}
//				return list;
//			}
//			
//		});
//	}

	@Override
	public void delete(Integer id) {
		String SQL = "DELETE FROM Student WHERE id=?";
		if(jdbcTemplate.update(SQL, id)>0)
			System.out.println("Deleted");
		
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "UPDATE Student SET age =? WHERE id=?";
		if(jdbcTemplate.update(SQL, age, id)>0)
			System.out.println("Updated.");
		
	}

}
