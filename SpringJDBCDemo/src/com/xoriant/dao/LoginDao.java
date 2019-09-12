package com.xoriant.dao;

import com.xoriant.dto.User;

public interface LoginDao {
	
	public void register(User user);
	
//	public User getUser(String userName);
	
	public void authentication(String username, String password);
	
	public void delete(String userName);
	
	public void update(String userName, String password);
	
	

}
