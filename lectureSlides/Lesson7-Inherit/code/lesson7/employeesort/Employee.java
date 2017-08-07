package lesson7.employeesort;



class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;
	}
	
	@Override
	public int compareTo(Employee e) {
		return name.compareTo(e.name);
	}


	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}


	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public String toString() {
		return name + " : " + salary;
	}

	
}
