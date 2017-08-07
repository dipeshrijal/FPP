package com.fppclass.progfinal_1;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSsn().compareTo(o2.getSsn());
	}
}
