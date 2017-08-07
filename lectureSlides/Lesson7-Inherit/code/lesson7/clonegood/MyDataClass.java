package lesson7.clonegood;

public class MyDataClass implements Cloneable {
	public MyDataClass clone() throws CloneNotSupportedException {
		return (MyDataClass)super.clone();
	}
}
