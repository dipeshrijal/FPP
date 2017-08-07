package lesson7.clonegood.otherpkg;

import lesson7.clonegood.MyDataClass;

public class CallingClass {
	@SuppressWarnings("unused")
	void myMethod(MyDataClass cl) {
		//now we have implemented one of the solutions
		//to the protected dilemma
		try {
			MyDataClass copy = (MyDataClass)cl.clone();
		}
		catch(CloneNotSupportedException e) {}
	}
}
