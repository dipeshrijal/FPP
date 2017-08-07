package com.fppclass.prog7_5;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double sides[] = { side, side, side, side };
		return sides;
	}

}
