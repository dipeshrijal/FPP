package lesson7.clonesimple;

public class MyClass implements Cloneable {
	String name = "harry";
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		try {
			MyClass mcopy = (MyClass)m.clone();
			MyClass mcopy2 = m.getMyClassCopy();
		} catch(CloneNotSupportedException e) {
			//handle
		}
	}
	
	public MyClass getMyClassCopy() throws CloneNotSupportedException {
		return (MyClass)this.clone();
	}
}

