package com.fppclass.prog7_5;

public class Rectangle extends ClosedCurve implements Polygon {
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

	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double sides[] = { width, width, length, length };
		return sides;
	}

}
