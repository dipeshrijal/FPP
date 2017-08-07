package com.fppclass.prog6_1;

public class Prog6_1 {

	double power(double x, int n) {
		double p = 0;
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		Prog6_1 obj = new Prog6_1();
		obj.power(5, 3);
		// System.out.println(obj.power(5, 3));
	}

}
