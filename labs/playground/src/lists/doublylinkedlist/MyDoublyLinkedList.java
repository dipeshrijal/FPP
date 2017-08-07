package lists.doublylinkedlist;

public class MyDoublyLinkedList {

	Node head;
	int size;

	public MyDoublyLinkedList() {
		head = null;
		size = 0;
	}

	public void addFront(String data) {
		if (isEmpty()) {
			Node node = new Node(null, data, null);
			head = node;

		} else {
			Node node = new Node(null, data, head);
			head.previous = node;
			head = node;
		}
		size++;
	}

	public void addLast(String data) {
		if (isEmpty()) {
			head = new Node(null, data, null);
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}

			Node node = new Node(current, data, null);
			current.next = node;
		}
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			return;
		} else {
			head = head.next;
			head.previous = null;
		}
		size--;
	}

	public void removeLast() {
		if (isEmpty()) {
			return;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}

			current.previous.next = null;
			current.previous = null;
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
		
		for (int i = 1; i < pos; i++) {
			current = current.next;
		}
		
		Node node = new Node(current.previous, data, current);	
		if (current.previous == null) {
			addFront(data);
		} else {
			current.previous.next = node;
			current.previous = node;
		}
		size++;
		

	}
	
	public void removeAt(int pos) {
		if (isEmpty()) {
			return;
		}
		
		if (pos < 1 || pos > size) {
			return;
		}
		
		Node current = head;
		
		for (int i = 1; i < pos; i++) {
			current = current.next;
		}
		
		if (current.previous == null) {
			removeFirst();
		} else if (current.next == null) {
			removeLast();
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		
		
		
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		Node node = head;

		StringBuilder sb = new StringBuilder();

		while (node != null) {
			sb.append(node.value).append("=>");
			node = node.next;
		}

		return sb.toString();
	}

}
