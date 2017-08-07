package solution;

import java.util.List;

public class Employee extends Account{
	public Employee(String id, List accounts) {
		this.id = id;
		this.accounts = accounts;
	}
	String id;
	List accounts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List getAccounts() {
		return accounts;
	}
	public void setAccounts(List accounts) {
		this.accounts = accounts;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
