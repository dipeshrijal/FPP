package com.fppclass.prog7_5;

public class Test3 {

	public static void main(String[] args) {
		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3),
				new Rectangle(3, 7) };
		for (Polygon cc : objects) {

			System.out.println("For this " + cc.getClass().getSimpleName()
					+ "\nPerimeter = " + cc.computePerimeter() + "\n");

		}

	}

}
