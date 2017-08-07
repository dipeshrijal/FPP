package com.fppclass.prog7_4;

public final class Circle extends ClosedCurve implements Polygon {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
