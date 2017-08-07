package com.fppclass.progfinal_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input
	 * list socSecNums and whose salary is > 80000. The list must be ordered by
	 * social security number, from lowest to highest. To sort, you must use a
	 * Collections sorting method and you must define your own Comparator to be
	 * used to compare Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table,
			List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> toReturn = new ArrayList<Employee>();
		for (String sNumber : socSecNums) {
			Employee ee = table.get(sNumber);
			if (ee != null) {
				if (ee.getSalary() > 80000) {
					toReturn.add(ee);
				}
			}
		}
		Collections.sort(toReturn, new EmployeeComparator());
		return toReturn;

	}
}
