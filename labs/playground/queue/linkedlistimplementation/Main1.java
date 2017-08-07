package linkedlistimplementation;

public class Main1 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enqueue("hello1");
		queue.enqueue("hi1");
		queue.enqueue("hi2");
		queue.enqueue("hello2");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
		System.out.println("**************************");
		
		queue.enqueue("hello1");
		queue.enqueue("hi1");
		queue.enqueue("hi2");
//		queue.enqueue("hello2");
		
		
		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
		
		
		System.out.println("*******************");
		
		System.out.println(queue);
	}

}
