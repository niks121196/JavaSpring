package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.dao.*;
import com.xoriant.dto.User;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		LoginDao login= (LoginDao) context.getBean("loginDaoImpl");
		
//		User user = new User("abc","abcd");
//		login.register(user);
		
		login.authentication("abc", "abcde");
		
		
				
	}
}
