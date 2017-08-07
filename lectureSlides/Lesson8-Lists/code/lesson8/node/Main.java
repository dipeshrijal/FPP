package lesson8.node;

public class Main {
	
	String[] stringData = {"Albert", "Billy", "Charles", "David", "Emma"};
	public static void main(String[] args) {
		Main m = new Main();
		m.populateNodes();
		boolean foundCharles = m.search("Charles");
		System.out.println("Found Charles? " + foundCharles);
		
		m.printNodes();
		m.addNode("Frank");
		m.removeNode("David");
		m.printNodes();
	}
	
	void populateNodes() {
		
		startNode = new Node();
		startNode.data = stringData[0];
		
		Node next = startNode;
		
		for(int i = 1; i < stringData.length; ++i) {
			next.node = new Node();
			next.node.data = stringData[i];
			next = next.node;
		}
	}
	Node startNode = null;
	boolean search(String s) {
		if(s == null) return false;
		Node next = startNode;
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
		Node next = startNode;
		while(next != null) {
			System.out.print(next);
			next = next.node;
		}
		System.out.println();
	}
	
	void addNode(String s) {
		Node newNode = new Node();
		newNode.data = s;
		newNode.node = startNode.node;
		startNode = newNode;
	}
	
	void removeNode(String s) {
		if(s == null) return;
		if(startNode != null && startNode.data.equals(s)){
			startNode = startNode.node;
			return;
		}
		Node previous = startNode;
		Node next = startNode.node;
		while(next != null) {
			if(s.equals(next.data)) {
				previous.node = next.node;
				return;
			}
			previous = next;
			next = next.node;		
		}
	}

}
