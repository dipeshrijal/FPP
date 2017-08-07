package lesson7.overridehashcode;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

class Employee {
	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return (Date) hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.salary==salary && e.hireDay.equals(hireDay);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	// instance fields
	private String name;
	private double salary;
	private Date hireDay;
}
