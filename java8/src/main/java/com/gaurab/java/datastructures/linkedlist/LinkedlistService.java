package com.gaurab.java.datastructures.linkedlist;

class Node {
	int data;
	Node next;

	public Node next() {
		return next;
	}
}

public class LinkedlistService {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			// System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	public void getMiddleNode() {

		Node node = head;
		Node middle = head;
		int length = 0;
		while (node.next != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			node = node.next();
		}
		if (length % 2 == 1) {
			middle = middle.next();
		}
		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle.data);
	}

	public void show() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
