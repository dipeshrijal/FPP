package com.fppclass.prog7_1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		double sum = 0;
		DeptEmployee[] emps = new DeptEmployee[5];
		DeptEmployee prof1 = new Professor("Bimarsh", 1992, 2, 20, 2, 10);
		DeptEmployee prof2 = new Professor("Yaman", 1990, 2, 20, 2, 10);
		DeptEmployee prof3 = new Professor("Dipesh", 1992, 2, 20, 2, 10);
		emps[0] = prof1;
		emps[1] = prof2;
		emps[2] = prof3;
		DeptEmployee sec1 = new Secretary("lala", 1992, 06, 22, 1, 1);
		DeptEmployee sec2 = new Secretary("la", 1992, 06, 22, 1, 1);
		emps[3] = sec1;
		emps[4] = sec2;

		String answer = JOptionPane
				.showInputDialog("Do you want to see the sum of all the salaries?(Y/N)");
		if (answer.equalsIgnoreCase("Y")) {
			for (DeptEmployee emp : emps) {
				System.out.println("salary" + emp.computeSalary());
				sum = sum + emp.computeSalary();
			}
			System.out.println("The sum of the salaries is: " + sum);
		} else {
			System.exit(0);
		}

	}
}
