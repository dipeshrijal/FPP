package lesson7.clonesimple;

public class Caller {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			MyClass cl = new MyClass();			
			MyClass copy = cl.getMyClassCopy();
		} catch(CloneNotSupportedException e) {
		}
	}
}
