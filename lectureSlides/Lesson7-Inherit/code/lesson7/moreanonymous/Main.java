package lesson7.moreanonymous;


/** Illustrates other ways anonymous inner classes can be used */
public class Main {
	//Create an anonymous subclass of Employee and store a computation in
		//an instance variable. No enclosing method is required here.

	String managerInfo = (new Employee("Manager", 200000) {
		//a percentage increase applied to salary
		double bonus;
		{
			bonus = .05;
		}
		int computeSalaryWithBonus() {
			return (int)((1+bonus) * getSalary());
		}
		@Override
		public String toString() {
			return "name : " + getName() + "\n" 
					+ "  base salary : " + getSalary() + "\n"
					+ "  bonus : " + bonus +"\n"
					+ "  actual salary : " + computeSalaryWithBonus();
		}
			
	}).toString();
		
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.managerInfo + "\n\n");
	}
	
	
}

