package linkedlistimplementation;

public class Main {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		stack.push("dipesh");
		stack.push("rijal");
		stack.push("code");
		stack.push("pop");
		
		System.out.println(stack.pop());
		
		stack.push("pop");
		
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		
		
		System.out.println(stack);

	}

}
