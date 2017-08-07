package com.helloworld.pkg;

public class Main {
	public static void main(String[] args)
	{
		Student undergrad= new Undergrad("Bimars", "Neupane", 20000, 20);
		undergrad.printData();
		Student grad= new Grad("Ram", "Kumar", "Science", 18000);
		grad.printData();
		Student[] students= new Student[2];
		students[0]=undergrad;
		students[1]=grad;
		double salary=0;
		
		for(Student s:students)
		{
			salary+=s.getPay();
		}
		System.out.println("The total salary of all the students is: "+salary);
		
	}

}
