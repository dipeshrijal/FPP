package com.fppclass.prog4_2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	Top() {
		mid = this.new Middle();
		midbot = mid.new Bottom();
	}

	// returns the value in the instance vble of Bottom
	int readBottom() {
		// implement
		return midbot.b;
	}

	class Middle {
		int m = 2;

		// returns sum of instance vble in Top and
		// instance vble in Bottom
		int addTopAndBottom() {
			// implement
			return t + midbot.b;
		}

		class Bottom {
			int b = 3;

			// returns the product of the instance vbles
			// in all three classes
			int multiplyAllThree() {
				// implement
				return t * m * b;
			}
		}
	}

	public static void main(String[] args) {

		Top top = new Top();
		Top.Middle mid = top.mid;
		Top.Middle.Bottom midbot = top.midbot;
		System.out.println(top.readBottom());
		System.out.println(mid.addTopAndBottom());
		System.out.println(midbot.multiplyAllThree());
	}

}