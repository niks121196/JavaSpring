package com.xoriant.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("audience")
@Aspect
public class Audience {
	
	public Audience() {
		System.out.println("Audience Class");
	}
	
	@Pointcut("execution(* com.xoriant.beans.Performer.perform(..))")
	private void performance() {}
	
	@Before("performance()")
	public void takeSeat(){
		System.out.println("Take seats");
	}
	
	@Before("performance()")
	public void turnOffCell(){
		System.out.println("Switch off Phones");
	}
	
	@AfterReturning("performance()")
	public void applaud(){
		System.out.println("Applaud");
	}
	
	@After("performance()")
	public void goHome(){
		System.out.println("Go home");
	}

}
