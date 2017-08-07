package com.fppclass.prog4_0;

public class Car {
	private float area;

	class Tire {
		private float circumference;

		Tire(float circumference) {
			this.circumference = circumference;
		}

		public void radius() {
			area = (float) (circumference / (2 * Math.PI));
		}
	}
}
