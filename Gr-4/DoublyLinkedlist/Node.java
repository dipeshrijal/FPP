package com.fppclass.prog8_0_0;

public class Node {

	Node previous;
	Node next;
	int data;

	Node(Node previous, Node next, int data) {
		this.previous = previous;
		this.next = next;
		this.data = data;

	}

}
