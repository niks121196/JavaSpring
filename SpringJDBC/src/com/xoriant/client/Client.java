package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.dao.StudentDao;
import com.xoriant.dao.StudentDaoImpl;
import com.xoriant.dto.Student;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDao dao = (StudentDao) context.getBean("studentDaoImpl");
		
//		Student student = new Student("Vivek", 21);
//		dao.addStudent(student);
//		dao.delete(3);
//		dao.update(4, 30);
		System.out.println(dao.getStudent(4));
		
		System.out.println(dao.listStudent());
	}

}
