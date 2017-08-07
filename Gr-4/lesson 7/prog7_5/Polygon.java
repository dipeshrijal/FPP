package com.fppclass.prog7_5;

public interface Polygon {

	abstract public double[] getArrayOfSides();

	static double sum(double arr[]) {
		double t = 0;
		for (int i = 0; i < arr.length; i++) {
			t = t + arr[i];
		}
		return t;

	}

	default double computePerimeter() {
		return sum(getArrayOfSides());
	}

}
