package com.xoriant.controllers;

public class Student {
	
	private String studentName;
	private String hobby;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [name=" + studentName + ", hobby=" + hobby + "]";
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
