package jan.prob2.corrected;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0;

		for (Employee employee : emps) {
			for (Account account : employee.getAccounts()) {
				sum += account.getBalance();
			}
		}

		return sum;
	}
}
