package lesson8.oldgenericlists;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add(1);
		
		Object[] ints = list.toArray();
		
		//No compiler warning for this
		//Produces runtime ClassCastException
		Integer x = (Integer)ints[0];
	}

}
