package solution;

import java.util.List;



public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
		double sum=0;
		for(Account e:emps){
			
			sum+=e.getBalance();
		}
		
		return sum;
	}
}
