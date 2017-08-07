package dec.prob2;

import java.util.List;

public class Statistics {
	/**
	 * Polymorphically computes and returns the sum of all the salaries of all
	 * the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double totalSalary = 0.0;
		for (EmployeeData employeeData : aList) {
			totalSalary += employeeData.getSalary();
		}
		
		return totalSalary;
		
		// implement
		// compute sum of all salaries of people in aList and return
	}
}
