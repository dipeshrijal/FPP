package inheritance.day1.undergrad;

public class Grad extends Student {
	
	private double gradSalary;

	Grad(String firstName, String lastName, double gradSalary) {
		super(firstName, lastName);
		this.gradSalary = gradSalary;
	}
	
	@Override
	public String printData() {
		return  super.printData() + " Total Salary is " + getPay();
	}

	@Override
	public double getPay() {
		return gradSalary;
	}

	public void setGradSalary(double gradSalary) {
		this.gradSalary = gradSalary;
	}

}
