package compare;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Employee e2 = new Employee("John", "Doe");		
		Employee e1 = new Employee("Dipesh", "Rijal");
		Employee e3 = new Employee("Dipesh", "Abc");
		Employee e4 = new Employee("Apple", "Cc");
		Employee e5 = new Employee("Zebra", "rr");
		
		
		
		
//		System.out.println(e1.equals(e2));
		
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("**************************");
		
//		Collections.sort(list);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		System.out.println("***********************");
		
		
		Collections.sort(list, new LastNameComparator());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		

	}

}
