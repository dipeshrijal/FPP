package lists.singlylinkedlist;

public class Main {
	
	public static void main(String [] args) {
		MySinglyLinkedList list = new MySinglyLinkedList();
		
		list.addFirst("dipesh");
		list.addFirst("rijal");		
		list.addLast("No");
		list.addFirst("hurray");
		
//		list.removeFirst();
//		
//		list.removeLast();
		
		list.insertAt(1, "haha");
		
		System.out.println(list);
	}

}
