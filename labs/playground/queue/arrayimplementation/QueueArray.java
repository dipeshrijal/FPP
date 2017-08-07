package arrayimplementation;

public class QueueArray {

	private Object[] arr;
	private int head;
	private int tail;
	private int size;
	private int capacity;

	public QueueArray(int capacity) {
		arr = new Object[capacity];
		this.capacity = capacity;
		size = 0;
		tail = -1;
		head = -1;
	}

	public void enqueue(Object data) {
		if (size == 0) {
			head = 0;
			tail = 0;
			arr[tail++] = data;
			size++;
		} else if (tail + 1 > capacity) {
			throw new IndexOutOfBoundsException("overflow");
		} else {
			arr[tail++] = data;
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

	public Object peek() {
		Object value = null;

		if (tail <= head) {
			throw new IndexOutOfBoundsException("underflow");
		} else {
			value = arr[head];
		}

		return value;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = head; i < tail; i++) {
			sb.append(arr[i]).append(",");
		}
		return sb.toString();
	}

}
