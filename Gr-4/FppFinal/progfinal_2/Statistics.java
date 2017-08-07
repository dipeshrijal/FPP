package com.fppclass.progfinal_2;

import java.util.List;

public class Statistics {
	/**
	 * Polymorphically computes and returns the sum of all the salaries of all
	 * the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sum = 0;
		for (EmployeeData emp : aList) {
			sum = sum + emp.getSalary();
		}
		return sum;
		// implement
		// compute sum of all salaries of people in aList and return
	}
}
