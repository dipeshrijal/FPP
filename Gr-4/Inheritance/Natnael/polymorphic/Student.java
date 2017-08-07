package inheritance;

abstract public class Student {
	private String firstName;
	private String lastName;
	private String dept;
	
	public Student(){
		
	}
	public Student(String fn, String ln, String dep){
		firstName = fn;
		lastName = ln;
		dept = dep;
	}
	
	public String getfirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getDept(){
		return dept;
	}
	
	public String toString(){
		return String.format("First %s , Last %s , Department %s", firstName, lastName, dept);
	}
	
	abstract public double getSalary();
	
}
