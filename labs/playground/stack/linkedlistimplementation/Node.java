package linkedlistimplementation;

public class Node {
	
	Node next;
	String data;
	
	Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return data + "";
	}

}
