package com.fppclass.prog7_1;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private LocalDate date;
	private double salary;

	public DeptEmployee(String name, int year, int month, int day, double salary) {
		this.name = name;
		this.date = LocalDate.of(year, month, day);
		this.salary = salary;
	}

	public double computeSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
