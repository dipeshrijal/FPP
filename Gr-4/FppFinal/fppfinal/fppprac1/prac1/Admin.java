package com.fpp.prac1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		Key theKey=null;
		HashMap<Key, Student> mapOfStudents= new HashMap<Key, Student>();
		for(Student student:students)
		{
		   theKey=new Key(student.getFirstName(), student.getLastName());
		   mapOfStudents.put(theKey, student);
		}
		return mapOfStudents;
	}
}
