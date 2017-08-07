package com.fppclass.prog6_2;

public class MinSort {
	char min;
	int index;
	StringBuilder ret = new StringBuilder();

	public char minimum(String s) {
		if (s.length() == 1) {
			return s.charAt(0);
		}
		min = s.charAt(0);
		if (min > s.charAt(1)) {
			min = s.charAt(1);
			minimum(s.substring(1));
		} else {
			minimum(s.substring(1));
		}
		return min;
	}

	public String sorted(String s) {
		if (s.length() == 0) {
			return s;

		}
		int minpos = s.indexOf(minimum(s));
		ret.append(minimum(s));
		StringBuilder deleter = new StringBuilder(s);
		deleter.deleteCharAt(minpos);
		sorted(deleter.toString());

		return ret.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinSort sort = new MinSort();
		System.out.println(sort.sorted("kbaba"));
		int[] b1 = { 1, 2, 3 };
		int[] b2 = { 1, 2, 3 };
		System.out.println(b1 == b2);

	}

}
