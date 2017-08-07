package lesson7.empmanager.useinheritance;

import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalDate;
import java.util.List;


class Employee {
	//instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	/** Make equals final to prevent unwanted overriding. Use
	 * instanceof to support Liskov Substitution for subclasses
	 */
	@Override
	public final boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob instanceof Employee) return false;
		Employee e = (Employee) ob;
		return (e.name.equals(name) && e.salary==salary && e.hireDay.equals(hireDay));	
	}
	
	/** Override hashCode whenever you override equals */
	@Override
	public final int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee copy = (Employee)super.clone();
		//no need to clone LocalDate
		return copy;
	}
	


	
}
