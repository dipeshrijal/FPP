package aprprob1;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Key key = (Key) obj;
		
		return firstName.equals(key.firstName) && lastName.equals(key.lastName);
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		
		result = result * 31 + firstName.hashCode();
		result = result * 31 + lastName.hashCode();
		
		return result;
	}
}
