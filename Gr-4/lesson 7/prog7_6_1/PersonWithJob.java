package com.fppclass.prog7_6_1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof PersonWithJob)) {
			return false;
		}
		PersonWithJob p = (PersonWithJob) ob;
		boolean equal = getName().equals(p.getName())
				&& this.getDateOfBirth().equals(p.getDateOfBirth());
		return equal;
	}

	public static void main(String[] arg) {
		GregorianCalendar dob = new GregorianCalendar(2001, 1, 22);
		PersonWithJob job1 = new PersonWithJob("alu", dob, 2000);
		PersonWithJob job2 = new PersonWithJob("alu", dob, 21000);
		System.out.println(job1.equals(job2));

	}
}
