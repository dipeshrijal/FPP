package lists.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		list.addFront("rijal");
		list.addFront("dipesh");
		list.addLast("john");
		list.removeFirst();
		list.removeLast();
		list.insertAt(2, "jane");
		list.addLast("hello");
		list.addFront("oi");
		list.insertAt(5, "cool");
		list.removeAt(4);

		System.out.println(list);
	}

}
