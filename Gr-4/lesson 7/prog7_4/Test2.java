package com.fppclass.prog7_4;

public class Test2 {

	public static void main(String[] arg) {
		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3),
				new Rectangle(3, 7) };
		// compute areas
		for (Polygon cc : objects) {

			System.out.println("For this " + cc.getClass().getSimpleName()
					+ "\n" + "Number of sides = " + cc.getNumberOfSides()
					+ "\nPerimeter = " + cc.computePerimeter() + "\n");

		}
	}
}
