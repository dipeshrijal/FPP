package com.fpp.prac1;

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
		// TODO Auto-generated method stub
		Key key=(Key) obj;
		if(key==null)
		{
			return false;
		}
		if(key.getClass()!=this.getClass())
		{
			return false;
		}
		boolean ret= this.firstName.equals(key.getFirstName()) && this.lastName.equals(key.getLastName());
		return ret;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return firstName.hashCode()+lastName.hashCode();
	}
}
