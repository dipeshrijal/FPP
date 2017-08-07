package com.fppclass.prog7_2;

public class Rectangle extends ClosedCurve {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return 2 * (width + length);
	}

}
