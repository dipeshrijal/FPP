package lesson3.myenums;

public class Main {
	public static void main(String[] args) {
		System.out.println(type(MyEnum.SECOND));
	}
	static boolean type(MyEnum val) {
		if(val == MyEnum.FIRST) return true;
		else return false;
	}
}
