package com.graduate.student1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grad grad = new Grad("Yaman","Upadhayay",390,2500);
		Undergrad ungrad = new Undergrad("Dipes","Rijal",350,10,20);

//		Student grad = new Grad("Yaman","Upadhayay",390,2500);
//		System.out.println(grad.getFirstName());
//		grad.setLastName("Raj Upadhayay");
//		System.out.println(grad.getLastName());
		
		System.out.println(grad.printData());
		
//		Student ungrad = new Undergrad("Dipes","Rijal",350,10,20);
//		System.out.println(ungrad.getFirstName());
//		ungrad.setLastName("Kumar Rijal");
//		System.out.println(ungrad.getLastName());
		
		System.out.println(ungrad.printData());
		
		// System.out.println(ungrad.getPay());
		
		Student[] st = new Student[2];
		st[0] = grad;
		st[1] = ungrad;
		
		double sumSalary = 0;
		for(int i=0; i<st.length;i++){
			sumSalary  += st[i].getPay();
		} 
		System.out.println("\n Total Sum of Student Salary: " + sumSalary);



	}

}
