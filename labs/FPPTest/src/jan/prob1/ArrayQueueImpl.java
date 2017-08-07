package jan.prob1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	int front = -1;
	int rear = 0;

	public int peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is empty");
		}
		return arr[front];
	}

	public void enqueue(int obj) {
		if (size() == arr.length) {
			resize();
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
			arr[rear++] = obj;
		} else {
			arr[rear++] = obj;
		}
	}

	public int dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is full");
		} else {
			int value = arr[front];
			front++;
			return value;
		}
	}

	private void resize() {		
		int len = arr.length;
		int newlen = 2 * len;
		int[] temp = new int[newlen];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;
	}

	public boolean isEmpty() {
//		return size == 0;
		return front == -1 || front > rear;
	}

	public int size() {
//		return size;
		return rear - front;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = front; i < rear; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		return sb.toString();
	}

}
