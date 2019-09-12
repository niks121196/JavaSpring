package com.xoriant.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
	}

	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (name+" "+age+" "+address);
	}

}
