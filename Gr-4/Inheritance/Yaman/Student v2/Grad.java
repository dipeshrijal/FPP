package com.graduate.student1;

public class Grad extends Student{
	private int gradSalary;
	
	Grad(){
		super();
		gradSalary = 0;
	}
	
	Grad(String firstName, String lastName, int dept, int gradSalary){
		super(firstName, lastName, dept);
		this.gradSalary = gradSalary;
	}

	public double getPay() {
		return gradSalary;
	}

	public void setGradSalary(int gradSalary) {
		this.gradSalary = gradSalary;
	}
	
	private String output = " Gradute Student: \n " + super.printData() + "\n Salary: %d";
	
	@Override
	public String printData() {
		// TODO Auto-generated method stub
		
		return String.format(output, gradSalary) ;
	}

}
