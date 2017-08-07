package arrrayimplementation;

public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(4);
		
		stack.pop();
		stack.peek();
		
		System.out.println(stack.size());
		
		System.out.println(stack.isEmpty());
		
		stack.push("dipesh");
		stack.push("rijal");
		stack.push("hello");
		stack.push("cool");
//		stack.push("overf");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack);

	}

}
