package lists.arraylist;

import java.util.Arrays;

public class MyArrayList {

	final int INITIAL_LENGTH = 4;
	Object[] arr = new Object[INITIAL_LENGTH];
	int size = 0;

	public void add(Object value) {
		if (size < arr.length) {
			resize();
		}
		arr[size++] = value;
	}

	public void remove(int pos) {
		if (pos < 0 || pos > size) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = pos; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
				arr[i + 1] = null;
			}
			size--;
		}

	}

	public Object get(int pos) {
		if (pos < 0 || pos > size) {
			return null;
		}

		return arr[pos];

	}

	public void insertAt(int pos, Object data) {
		if (pos < 0 || pos > size) {
			return;
		}
		
		size++;
		
		for (int i = size - 1; i > pos; i--) {
			arr[i] = arr[i - 1];			
		}
		
		arr[pos] = data;
		

	}

	public int size() {
		return size;
	}

	public void resize() {

		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(arr[i]).append(", ");
		}
		sb.append(arr[size - 1]).append("]");
		return sb.toString();
	}

}
