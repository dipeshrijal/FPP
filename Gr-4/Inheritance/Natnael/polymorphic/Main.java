package inheritance;

public class Main {
	public static void main(String[] args) {
		/*
		 * Student sObj = new Student("Nati", "Getch", "Compro");
		 * System.out.println(sObj);
		 * 
		 * Grad gradObj = new Grad("Nati", "Getch", "Compro",1500);
		 * System.out.println(gradObj);
		 * 
		 * Undergrad ungradObj = new Undergrad("Natael", "Getchew",
		 * "Compro",10,20); System.out.println(ungradObj);
		 */

		// Student ss = new Sum();
		// Grad gg = (Grad)ungradObj;
		/*
		 * sum cObj = new sum(5); System.out.println(cObj.getSum());
		 * 
		 * finalClass fc = new finalClass();
		 */

		/* polymorphic method */

		Student[] sObj = new Student[2];
		sObj[0] = new Grad("Nati", "Getch", "Compro", 1500);
		sObj[1] = new Undergrad("Natael", "Getchew", "Compro", 10, 20);

		double totalSalary = 0;
		for (Student e : sObj) {
			System.out.println(e);
			totalSalary += e.getSalary();
		}
		
		System.out.println("Total Salary "+ totalSalary);
		

	}

}
