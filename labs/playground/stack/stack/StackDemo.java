package stack;


import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("dipesh");
		stack.push("rijal");
		stack.push("last");
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack.peek());
		stack.add("hello");
		
		System.out.println(stack);
	}

}
