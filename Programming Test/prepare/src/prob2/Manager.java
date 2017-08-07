package prob2;

public class Manager extends Employee {
	private double bonus;
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	public double getBonus() {
		return bonus;
	}
}
