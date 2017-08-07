package inheritance.day1.undergrad;

public class Main {

	public static void main(String[] args) {
		
		Student [] student = new Student [2];

		Student undergrad = new Undergrad("Dipesh", "Rijal", 30, 20);
		System.out.println(undergrad.printData());
		
		Student grad = new Grad("John", "Doe", 4000);
		System.out.println(grad.printData());
		
		student[0] = undergrad;
		student[1] = grad;
		
		double salary = 0;
		
		for (Student stu : student) {
			salary += stu.getPay();
		}
		
		System.out.println("Total Salay is " + salary);
	}
}
