package dec.prob1;

public class Employee {
	private String name;
	private int salary;
	private String ssn;

	public Employee(String name, int salary, String ssn) {
		this.salary = salary;
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return "(" + ssn + ": " + name + ", " + salary + ")" ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee employee = (Employee) obj;
		
		return employee.ssn.equals(ssn);
	}
	
	

}
