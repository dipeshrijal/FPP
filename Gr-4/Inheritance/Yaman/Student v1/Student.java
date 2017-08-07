package com.graduate.student;

public class Student {
	private String firstName;
	private String lastName;
	private int dept;
	
	Student(){
		firstName = "Not_Defined";
		lastName = "Not_Defined";
		dept = 0;
	}
	
	Student(String firstName, String lastName, int dept){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}
	
	public String printData(){
		return ("Name: " + firstName + " " + lastName + "\n Dept: " + dept);
	}
	

}
