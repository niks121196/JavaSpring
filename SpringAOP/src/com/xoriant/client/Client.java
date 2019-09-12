package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.beans.*;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		Performer p = (Performer) context.getBean("performer");
		p.perform();

	}
	
	
}
