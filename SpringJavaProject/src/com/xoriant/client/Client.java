package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.beans.*;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
		
//		Address a = (Address) context.getBean("address");
//		System.out.println(a);
		
		Person p = context.getBean(Person.class);
		System.out.println(p);
	}
}
