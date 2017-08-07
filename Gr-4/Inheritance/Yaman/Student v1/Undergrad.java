package com.graduate.student;

public class Undergrad extends Student {
	private int underWage;
	private int underHours;

	Undergrad() {
		super();
		underWage = 0;
		underHours = 0;
	}

	Undergrad(String firstName, String lastName, int dept, int underWage, int underHours) {
		super(firstName, lastName, dept);
		this.underWage = underWage;
		this.underHours = underHours;
	}

	public int getUnderWage() {
		return underWage;
	}

	public void setUnderWage(int underWage) {
		this.underWage = underWage;
	}

	public int getUnderHours() {
		return underHours;
	}

	public void setUnderHours(int underHours) {
		this.underHours = underHours;
	}
	
	public int getPay(){
		return underWage * underHours;
	}
	
	private String output = "\n\n Undergradute Student: \n " + super.printData() + "\n Salary: %d";
	@Override
	public String printData() {
		// TODO Auto-generated method stub
		
		return String.format(output, getPay());
	}

	
}
