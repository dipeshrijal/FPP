package com.fppclass.progfinal_2_1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	int size = 0;

	public int peek() throws QueueException {
		if (front == -1 || front > rear) {
			throw new QueueException("peek failed with empty queue");
		}
		return arr[front];
		// implement
	}

	public void enqueue(int obj) {
		// implement
		if (front == -1) {
			front++;
			arr[front] = obj;
			size++;
			rear++;
		} else if (rear == arr.length) {
			int[] temp = new int[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
			arr[rear] = obj;
			rear++;
			size++;
		} else {
			arr[rear] = obj;
			size++;
			rear++;
		}
	}

	public int dequeue() throws QueueException {
		if (front == -1 || front > rear)
			throw new QueueException("Deque failed, empty queue");
		int retVal = arr[front];
		front++;
		size--;
		return retVal;
		// implement
	}

	public boolean isEmpty() {
		// implement
		if (front == -1 || front > rear) {
			return true;
		}
		return false;
	}

	public int size() {
		// implement
		return size;
	}

}
