package prob2;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("John", 110000));
		emps.add(new Employee("Tom", 110000));
		emps.add(new Employee("Edward", 120000));
		emps.add(new Employee("Rich",90000));
		emps.add(new Employee("Kevin", 100000));

		List<Manager> managers = new ArrayList<>();
		emps.add(new Manager("Andrew", 110000, 10000));
		emps.add(new Manager("Rabelais", 130000, 5500));
		emps.add(new Manager("Phil", 135000, 12000));
		emps.add(new Manager("Tony",95000, 8000));
				
		double salarySum = Statistics.computeSumOfSalaries(emps,  managers);
		System.out.println(salarySum);
		
	}

}
