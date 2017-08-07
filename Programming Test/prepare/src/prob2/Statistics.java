package prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Merges the two input lists into a single list and then polymorphically
	 * computes and returns the sum
	 * of all the salaries of all the employees/managers in the merged list.
	 */
	public static double computeSumOfSalaries(List<Employee> emps, List<Manager> managers) {
		
		double sal=0.0;
	//this for loop is iterating through whole List
	//	for(int i=0;i<emps.size();i++)
		for(Employee e: emps){
		
		//e.getSalary();
	//	Employee e=emps.get(i);//since emps is first catering employee and then manager; while computing result it is taking care of 
							//method overriding salary in Manager
		sal+=(e.getSalary());	
		}
					
		//implement
		//convert to a single list and compute sum of all salaries
		return sal;
	}
}
