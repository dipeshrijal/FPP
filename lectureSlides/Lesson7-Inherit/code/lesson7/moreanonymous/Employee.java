package lesson7.moreanonymous;

public class Employee {
	private String name;
	private int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();	
	}
}

