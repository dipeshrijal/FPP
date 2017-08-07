

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrays {
	/**
	 * Returns a List of char[]'s representing
	 * all subarrays of letters array. For example
	 * on input {'a','b','c'} the method returns
	 * {
	 * 	[]
	 * 	['a'], ['b'], ['c'],
	 *  [a',b'], ['a','c'], ['b','c']
	 *  ['a', 'b','c']
	 * } 	
	 */
	static List<char[]> power = new ArrayList<char[]>();
	public static List<char[]> subcoll(char[] letters) {
		if(letters == null) return null;
		char[] emptyset = new char[0];
		power.add(emptyset);
		for(int i = 0; i < letters.length; ++i) {
			adjoinAll(letters[i]);
		}
		return power;	
	}
	
	private static void adjoinAll(char c) {
		int len = power.size();
		
		for(int k = 0; k < len; ++k) {
			char[] s= power.get(k);
			char[] t = new char[s.length + 1];
			for(int i = 0; i < s.length; ++i) {
				t[i] = s[i];
			}
			t[s.length] = c;
			power.add(t);
		}
	}
	
	
	public static void main(String[] args) {
		char[] test = {'a','c','t'};
		List<char[]> allsubarrays = subcoll(test);
		for(char[] arr : allsubarrays) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
