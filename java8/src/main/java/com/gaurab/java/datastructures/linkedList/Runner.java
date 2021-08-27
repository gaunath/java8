package com.gaurab.java.datastructures.linkedList;

public class Runner {
	public static void main(String[] args) {

		LinkedlistService list = new LinkedlistService();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(11);
		list.insert(16);
		list.insertAtStart(25);
		
		list.insertAt(0, 55);
		
		list.deleteAt(2);
		list.getMiddleNode();
		
		list.show();
		
	
		
	}
}
