package lesson7.empmanager.usecomposition;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;


/** Implementation of Manager using Compostion instead of Inheritance.
 *  Now we can't use Manager in context of polymorphism, but it can
 *  support a different equals implementation.
 *  
 */
public class Manager {
	private Employee emp;
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		emp = new Employee(name,salary, year, month, day);
		bonus = 0;
	}	
	public double getSalary() {
		// use private Employee instance instead of super
		double baseSalary = emp.getSalary();
		return baseSalary + bonus;
	}
	public String getName() {
		return emp.getName();
	}
	public LocalDate getHireDay() {
		return emp.getHireDay();
	}
	public void setBonus(double b) {
		bonus = b;
	}
	
	/** Declare final so that subclasses can't override */
	@Override
	public final boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob.getClass() != getClass()) return false;
		Manager m = (Manager) ob;
		return (m.emp.equals(emp) && m.bonus == bonus);	
	}
	
	/** Override hashCode whenever you override equals */
	@Override
	public final int hashCode() {
		return Objects.hash(emp, bonus);
	}
	
}
