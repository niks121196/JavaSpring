package com.xoriant.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("managment")
@Aspect
public class Management {
	
	public Management() {
		System.out.println("Management");
	}
	
	@Pointcut("execution(* com.xoriant.beans.Audience.takeSeat(..))")
	private void seating() {}
	
	@Before("seating()")
	public void light() {
		System.out.println("Light arrangement");
	}
	

}
