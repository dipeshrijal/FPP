package inheritance.day1.undergrad;

public class Undergrad extends Student {

	private double underWage;
	private double underHours;

	Undergrad(String firstName, String lastName, double underWage, double underHours) {
		super(firstName, lastName);
		this.underWage = underWage;
		this.underHours = underHours;
	}

	@Override
	public String printData() {
		return super.printData() + " Total Salary is " + getPay();
	}

	@Override
	public double getPay() {
		return underWage * underHours;
	}

	public double getUnderWage() {
		return underWage;
	}

	public void setUnderWage(double underWage) {
		this.underWage = underWage;
	}

	public double getUnderHours() {
		return underHours;
	}

	public void setUnderHours(double underHours) {
		this.underHours = underHours;
	}

}
