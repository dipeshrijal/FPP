package compare;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getFirstName().compareTo(emp2.getFirstName()) == 0) {
			return emp1.getLastName().compareTo(emp2.getLastName());
		} else {
			return emp1.getFirstName().compareTo(emp2.getFirstName());
		}
		
//		return emp1.getFirstName().compareTo(emp2.getFirstName());
	}
}
