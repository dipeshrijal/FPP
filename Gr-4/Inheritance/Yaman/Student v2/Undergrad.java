package com.graduate.student1;

public class Undergrad extends Student {
	private double underWage;
	private double underHours;

	Undergrad() {
		super();
		underWage = 0;
		underHours = 0;
	}

	Undergrad(String firstName, String lastName, int dept, double underWage, double underHours) {
		super(firstName, lastName, dept);
		this.underWage = underWage;
		this.underHours = underHours;
	}

	public double getUnderWage() {
		return underWage;
	}

	public void setUnderWage(int underWage) {
		this.underWage = underWage;
	}

	public double getUnderHours() {
		return underHours;
	}

	public void setUnderHours(int underHours) {
		this.underHours = underHours;
	}
	
	public double getPay(){
		return underWage * underHours;
	}
	
	private String output = "\n\n Undergradute Student: \n " + super.printData() + "\n Salary: %f";
	@Override
	public String printData() {
		// TODO Auto-generated method stub
		
		return String.format(output, getPay());
	}

	
}
