package com.helloworld.pkg;

abstract public class Student {
	
	private String firstName;
	private String lastName;
	
	Student(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void printData()
	{
		System.out.println("FirstName: "+firstName+" "+"LastName: "+lastName);
	}
	 abstract public double getPay();
	
	

}
