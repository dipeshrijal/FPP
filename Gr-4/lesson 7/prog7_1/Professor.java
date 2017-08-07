package com.fppclass.prog7_1;

public class Professor extends DeptEmployee {
	private int numberofPublications;

	Professor(String name, int year, int month, int day, double salary,
			int numofPublications) {
		super(name, year, month, day, salary);
		this.numberofPublications = numofPublications;
	}

	public int getNumberofPublications() {
		return numberofPublications;
	}

	public void setNumberofPublications(int numberofPublications) {
		this.numberofPublications = numberofPublications;
	}

}
