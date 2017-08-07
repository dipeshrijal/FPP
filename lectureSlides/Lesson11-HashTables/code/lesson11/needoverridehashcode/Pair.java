package lesson11.needoverridehashcode;

import java.util.Objects;

public class Pair {
	String first;
	String second;
	public Pair(String f, String s) {
		first = f;
		second = s;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return p.first.equals(first) && p.second.equals(second);
	}
	
	/*
	//modern way
	public int hashCode() {
		return Objects.hash(first, second);
	
	}*/
	
	//legacy approach
//	public int hashCode() {
//		return 3 * first.hashCode() 
//		        + 5 * second.hashCode();	
//	}

}
