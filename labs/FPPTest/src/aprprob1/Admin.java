package aprprob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
//		return null;
		
		HashMap<Key, Student> map = new HashMap<>();
		
		for (Student student : students) {
			map.put(new Key(student.getFirstName(), student.getLastName()), student);
		}
		
		return map;
		
		
		
	}
}
