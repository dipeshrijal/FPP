package com.fppclass.prog7_6_3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	private Person person;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != this.getClass()) {
			return false;
		}
		PersonWithJob p = (PersonWithJob) ob;
		boolean equal = p.person.equals(person) && getSalary() == p.getSalary();
		return equal;
	}

	public static void main(String[] arg) {
		GregorianCalendar dob = new GregorianCalendar(2001, 1, 22);
		PersonWithJob job1 = new PersonWithJob("alu", dob, 2000);
		PersonWithJob job2 = new PersonWithJob("alu", dob, 2000);
		System.out.println(job1.equals(job2));

	}
}
