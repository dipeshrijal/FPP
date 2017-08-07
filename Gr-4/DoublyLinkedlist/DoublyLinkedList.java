package com.fppclass.prog8_0_0;

public class DoublyLinkedList {
	Node header;

	DoublyLinkedList() {
		header = null;
	}

	public void addInHead(int data) {
		if (header == null) {
			header = new Node(null, null, data);
			return;
		} else {
			Node newNode = new Node(null, null, data);
			newNode.next = header;
			header.previous = newNode;
			header = newNode;
		}
	}

	public void addIntail(int data) {
		if (header == null) {
			header = new Node(null, null, data);
		}
		Node temp = header;
		Node append = new Node(null, null, data);
		while (temp.next != null) {
			temp = temp.next;
		}
		append.previous = temp;
		temp.next = append;

	}

	public boolean deleteFromHead(int data) {
		Node temp = header;
		if (temp == null) {
			return false;
		}
		if (temp.data == data) {
			header = temp.next;
			header.previous = null;
			return true;
		}
		while (temp.next != null) {
			if (temp.data == data) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				return true;
			}
			return false;
		}
		return false;
	}

	public void getlist() {
		Node temp = header;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] arr) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addInHead(11);
		list.addInHead(22);
		list.getlist();
		list.deleteFromHead(22);
		list.getlist();
	}
}
