package com.xoriant.dto;

public class Student {
	private Integer rollNo;
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Integer getRollNo() {
		return rollNo;
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

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [RollNo = " + rollNo + ", Name = " + name + ", Age = " + age + "]";
	}
	
	
	
	

}
