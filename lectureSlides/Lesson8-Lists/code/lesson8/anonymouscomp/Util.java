package lesson8.anonymouscomp;


public class Util {

	public static String reverse(String s) {
		if(s.length() == 0) return s;
		String first = "" + s.charAt(0);
		return  reverse(s.substring(1)) + first;
	}
	
}

