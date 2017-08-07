package lesson8.singlylinked;

import lesson8.node.Main;
import lesson8.node.Node;

public class SinglyLinkedListWithHeader {
	//Node header = null; //contains no data, cannot be removed
	
	public SinglyLinkedListWithHeader() {
		//header should never be null
		header = new Node();
	}
	boolean search(String s) {
		if(s == null) return false;
		//start node for searches is header.node
		Node next = header.node;
		while(next != null) {
			String t = next.data;
			if(s.equals(t)) {
				return true;
			}
			next = next.node;
		}
		return false;
	}
	
	void printNodes() {
		Node next = header.node;
		while(next != null) {
			System.out.print(next);
			next = next.node;
		}
		System.out.println();
	}
	
	void addNode(String s) {
		Node newNode = new Node();
		newNode.data = s;
		
		//link from newNode to current header.node
		newNode.node = header.node;
		
		//link from header to newNode
		header.node = newNode;		
	}
	
	Node header = null; //contains no data, cannot be removed
	
	void removeNode(String s) {
		if(s == null) return;
		Node next = header.node;
		Node previous = header;
		
		//No special case for removing first node
		while(next != null) {
			if(s.equals(next.data)) {
				previous.node = next.node;
				return;
			}
			previous = next;
			next = next.node;		
		}
	}
	
	/** Implement as inner class */
	private class Node {
		String data;
		Node node;
		
		@Override
		public String toString() {
			return data + " ";
		}
	}
	
	
	public static void main(String[] args) {
		String[] stringData = {"Albert", "Billy", "Charles", "David", "Emma"};
		SinglyLinkedListWithHeader sll = new SinglyLinkedListWithHeader();
		//populate
		for(int i = stringData.length -1; i >= 0; i--) {
			sll.addNode(stringData[i]);
		}
		boolean foundCharles = sll.search("Charles");
		System.out.println("Found Charles? " + foundCharles);
		
		sll.printNodes();
		sll.addNode("Frank");
		sll.removeNode("David");
		sll.printNodes();
	}
}


