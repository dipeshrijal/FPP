

import java.util.ArrayList;

public class AppleBerryCherry {
	int apple, berry, cherry;
	ArrayList<String> sort(ArrayList<String> list) {
		if(list == null || list.size() <= 1) return list;
		int len = list.size();
		for(int i = 0; i < len; ++i) {
			String next = list.get(i);
			if(next.charAt(0) == 'a') ++apple;
			else if(next.charAt(0) == 'b') ++berry;
			else if(next.charAt(0) == 'c') ++cherry;
			else throw new IllegalArgumentException("Bad input");
		}
		ArrayList<String> ret = new ArrayList<String>();
		int count = 0;
		for(; count < apple; ++count) {
			ret.add("apple");
		}
		for(; count < apple + berry; ++count) {
			ret.add("berry");
		}
		for(; count < apple + berry + cherry; ++count) {
			ret.add("cherry");
		}
		return ret;
	}
	public static void main(String[] args) {
		AppleBerryCherry abc = new AppleBerryCherry();
		ArrayList<String> test = new ArrayList<String>();
		test.add("cherry");
		test.add("berry");
		test.add("cherry");
		test.add("berry");
		test.add("apple");
		test.add("apple");
		test.add("cherry");
		System.out.println(abc.sort(test));
	}
}
