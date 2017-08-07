package com.helloworld.pkg;

public class Undergrad extends Student {
	String dept;
	double underWage;
	double underHours;
	Undergrad(String firstName, String lastName,double underWage, double underHours) {
		super(firstName, lastName);
		this.underHours=underHours;
		this.underWage=underWage;
		// TODO Auto-generated constructor stub
	}
    @Override
	public double getPay()
	{
		return underHours*underWage;
	}
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		super.printData();
		System.out.println("Pay: "+getPay());
	}
	

}
