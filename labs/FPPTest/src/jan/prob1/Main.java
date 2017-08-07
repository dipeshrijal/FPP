package jan.prob1;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
//		q.dequeue();
		 
		for (int i = 1; i < 100; i++)
			q.enqueue(i);
		for (int i = 1; i < 22; i++) {
			 q.dequeue();
		}
		
		System.out.println("Peek into queue " + q.peek());
		
		System.out.println("size is " + q.size());

		System.out.println("Element of queue " + q);

	}

}
