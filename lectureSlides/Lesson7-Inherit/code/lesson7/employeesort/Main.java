package lesson7.employeesort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Employee[] emps = {new Employee("Joe", 50000),
				           new Employee("Anne", 100000),
				           new Employee("Steve", 88000)};
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));

	}

}
