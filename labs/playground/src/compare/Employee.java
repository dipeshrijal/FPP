package compare;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}		
		
		Employee emp = (Employee) obj;
		
		
//		return firstName.equals(emp.getFirstName()) && lastName.equals(emp.getLastName());	
		return hashCode() == emp.hashCode();
		
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		
		result = result * 31 + firstName.hashCode();
		result = result * 31 + lastName.hashCode();
		
		return result;
	}

//	@Override
//	public int compareTo(Employee emp) {
//		return emp.firstName.compareToIgnoreCase(this.firstName);
//	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
	

}
