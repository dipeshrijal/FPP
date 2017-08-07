package arrrayimplementation;

public class MyStack {
	
	int top;
	int maxSize;

	String[] arr;

	MyStack(int n) {
		maxSize = n;
		arr = new String[maxSize];
		top = 0;
	}

	public void push(String data) {
		if (top < maxSize) {
			arr[top] = data;
			top++;
		} else {
			System.out.println("Stackoverflow");
		}

	}

	public String pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return "";
		}

		String str = arr[top - 1];
		arr[top - 1] = null;
		top--;
		return str;

	}

	public String peek() {
		
		if (isEmpty()) {
			System.out.println("stack is empty");
			return "";
		}

		return arr[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int size() {
		return top;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < top; i++) {
			sb.append(arr[i]).append("->");
		}

		return sb.toString();
	}

}
