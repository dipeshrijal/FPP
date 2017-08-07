package arrayimplementation;

public class MyQueue {

	Object[] arr;
	int total;
	int head;
	int tail;
	int size;
	
	public MyQueue(int total) {
		this.total = total;
		arr = new Object[total];
		head = -1;
		tail = -1;
		size = 0;
	}
	
	public void enqueue(Object value) {
		if (isEmpty()) {
			head = 0;
			tail = 0;
			arr[tail++] = value;
			size++;
		} else if (isFull()) {
			throw new IndexOutOfBoundsException("overflow");
		} else {
			arr[tail++] = value;
			size++;		
		}
	}
	
	public Object dequeue() {
		Object value = null;
		
		if (tail <= head) {
			throw new IndexOutOfBoundsException("underflow");
		} else {
			value = arr[head];
			arr[head] = null;
			head++;
			size--;
		}
		return value;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return tail + 1 > total;
	}
	
	public int size() {
		return size;
	}


	
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = head; i < tail; i++) {
			sb.append(arr[i]).append("=>");
		}
		return sb.toString();
	}

}
