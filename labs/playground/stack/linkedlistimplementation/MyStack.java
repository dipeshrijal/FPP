package linkedlistimplementation;

public class MyStack {
	
	Node head;
	int top;
	
	public MyStack() {
		head = null;
		top = -1;
	}
	
	public void push(String data) {
		if (head == null) {
			head = new Node(data, null);
		} else {
			Node node = new Node(data, head);
			head = node;
		}
		top++;
		
	}
	
	public String pop() {
		if (isEmpty()) {
			return "stack is empty";
		}
		
		Node current = head;
		head = current.next;
		top--;
		return current.data;
	}
	
	public String peek() {
		if (isEmpty()) {
			return "stack is empty";
		}
		return head.data;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	@Override
	public String toString() {
		Node current = head;
		
		StringBuilder sb = new StringBuilder();
		
		while(current != null) {
			sb.append(current.data).append("=>");
			current = current.next;
		}
		
		return sb.toString();
	}
	
	

}
