package lists.doublylinkedlist;

public class Node {
	Node previous;
	Node next;
	String value;
	
	
	public Node(Node previous, String value, Node next) {
		this.previous = previous;
		this.value = value;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
	
	
	

}
