package lists.singlylinkedlist;

public class MySinglyLinkedList {
	
	Node head;
	int size;
	
	public MySinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(String data) {
		if (isEmpty()) {
			head = new Node(data, null);
		} else {
			Node node = new Node(data, head);
			head = node;
		}
		size++;
	}
	
	public void addLast(String data) {
		if (isEmpty()) {
			head = new Node(data, null);
		} else {
			Node current = head;
			
			while (current.next != null) {
				current = current.next;
			} 
			
			Node node = new Node(data, null);
			current.next = node;
		}
		size++;
	}
	
	public void removeFirst() {
		if (isEmpty()) {
			return;
		} else {
			head = head.next;
		}
		size--;
	}
	
	public void removeLast() {
		if (isEmpty()) {
			return;
		} else {
			
			Node current = head;
			
			while(current.next.next != null) {
				current = current.next;
			}
			
			current.next = null;
		}
		size--;
	}
	
	public void insertAt(int pos, String data) {
		if (isEmpty()) {
			return;
		}
		if (pos < 1 || pos > size) {
			return;
		}
		
		Node current = head;
		
		for (int i = 1; i < pos -1; i++) {
			current = current.next;
		}
		
		System.out.println(current);
		
		Node node = new Node(data, current.next);		
		current.next = node;	
		size++;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public String toString() {
		Node node = head;
		StringBuilder sb = new StringBuilder();
		while(node != null) {
			sb.append(node.data).append("=>");
			node = node.next;
		}
		return sb.toString();
	}

}
