package arrayimplementation;

public class Main {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue(3);
		
//		System.out.println("Dequeue " + queue.dequeue());
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
//		queue.enqueue("dipesh");
		
		System.out.println("Dequeue " + queue.dequeue());
		System.out.println("Dequeue " + queue.dequeue());
		System.out.println("Dequeue " + queue.dequeue());
		
		System.out.println(queue);

//		QueueArray queue = new QueueArray(10);
//		
//
//		queue.enqueue("dipesh");
//		queue.enqueue("jane");
//		queue.enqueue("john");
//		
//		System.out.println(queue);
//		
//		System.out.println("size of array is " + queue.size());
//		
//		 System.out.println("popping " + queue.dequeue());
//		 System.out.println("popping " + queue.dequeue());
//		 System.out.println("popping " + queue.dequeue());
//		 
////		 queue.dequeue();
////		 queue.peek();
//		 
//		 System.out.println("size of array is " + queue.size());
//		 
//		 queue.enqueue("hullad");
//		 queue.enqueue("nana");
//		 
//		 System.out.println("size of array is " + queue.size());
//		 
//		 queue.dequeue();
//		 
//		 System.out.println("size of array is " + queue.size());
//		 
//		 System.out.println("peeking " + queue.peek());
//		 
//		 
//		 System.out.println("size of array is " + queue.size());
//		 
//		 queue.enqueue(10);
//
//		System.out.println(queue);
	}

}
