package lesson3.objectdemo;

public class Account {
	private String id;
	Account() {
		id = generateId();
	}
	private double balance;
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	
	private String generateId() {
		//in actual practice, read from a database or
		//external data source
		return "" + RandomNumbers.getRandomInt(1000,9999);
	}
	
	public String toString() {
		return id + ":" + balance;
	}
	
	
}
