package dec.prob1;

import java.util.Comparator;

public class SsnComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		return arg0.getSsn().compareTo(arg1.getSsn());
	}

}
