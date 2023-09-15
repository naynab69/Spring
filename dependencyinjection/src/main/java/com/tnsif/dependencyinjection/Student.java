package com.tnsif.dependencyinjection;

public class Student {
	
	
	//dependency in the form of literals
	private String studentName;
	private int id;

	/*
	 * //setter for DI public void setId(int id) { this.id = id; }
	 * 
	 * 
	 * 
	 * //setter method public void setStudentName(String studentName) {
	 * this.studentName = studentName; }
	 * 
	 */


	//constructor for DI
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	
	void print()
	{
		System.out.println(studentName);
		System.out.println(id);
	}

	

}
