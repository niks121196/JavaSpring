package com.xoriant.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xoriant.dto.User;


@Component("loginDaoImpl")
public class LoginDaoImpl implements LoginDao {
	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate= new JdbcTemplate(datasource);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean register(User user) {
		String SQL = "insert into user values(?, ?)";
		if(jdbcTemplate.update(SQL,user.getUserName(), user.getPassword())>0)
			return true;
		else
			return false;
		
	}

	@Override
	public void authentication(String username, String password) {
		String SQL = "select count(*) from user where username=? and password=?";
		int count = jdbcTemplate.queryForObject(SQL, new Object[] {username, password}, Integer.class);
		if (count>0)
			System.out.println("Correct username and password");
		else
			System.out.println("Please check username or password");
		
	}

	@Override
	public void delete(String userName) {
		String SQL = "DELETE FROM user WHERE username=?";
		if(jdbcTemplate.update(SQL, userName)>0)
			System.out.println("Deleted");
		else
			System.out.println("User does not exist.");
		
	}

	@Override
	public void update(String userName, String password) {
		String SQL = "UPDATE Student SET password =? WHERE username=?";
		if(jdbcTemplate.update(SQL, password, userName)>0)
			System.out.println("Updated.");
		else
			System.out.println("User does not exist.");
		
	}

}
