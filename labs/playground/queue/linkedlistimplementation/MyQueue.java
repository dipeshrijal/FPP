package linkedlistimplementation;

public class MyQueue {

	Node head;
	int size;

	MyQueue() {
		head = null;
		size = 0;
	}

	public void enqueue(String value) {
		if (head == null) {
			head = new Node(value, null);
		} else {
			Node node = new Node(value, head);
			head = node;
		}

		size++;

	}

	public String dequeue() {
		
		if (size == 0) {
			return "Queue is Empty";
		} else if (head.next == null) {
			String temp = head.data;
			head = null;
			size--;
			return temp;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			String temp = current.next.data;
			current.next = null;
			size--;
			return temp;
		}
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		Node current = head;

		StringBuilder sb = new StringBuilder();

		while (current != null) {
			sb.append(current.data).append(" ");

			current = current.next;
		}

		return sb.toString();
	}

}
