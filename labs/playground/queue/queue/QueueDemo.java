package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("dipesh");
		queue.add("rijal");
		queue.poll();
		queue.offer("hello");
		
		System.out.println(queue);
	}

}
