package com.xoriant.beans;

import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {
	
	
	public Performer() {
		System.out.println("Performer Class");

	}
	
	public void perform(){
		System.out.println("Performing");
		
	}

}
