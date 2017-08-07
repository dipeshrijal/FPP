package com.helloworld.pkg;

public class Grad extends Student {
	String dept;
	double gradSalary;

	Grad(String firstName, String lastName, String dept, double gradSalary) {
		super(firstName, lastName);
		this.dept=dept;
		this.gradSalary=gradSalary;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPay()
	{
		return gradSalary;
	}
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		super.printData();
		System.out.println("Pay: "+getPay());
	}
}
