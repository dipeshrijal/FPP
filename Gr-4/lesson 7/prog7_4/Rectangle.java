package com.fppclass.prog7_4;

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
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * length + 2 * width;
	}

}
