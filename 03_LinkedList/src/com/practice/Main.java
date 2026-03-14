package com.practice;



public class Main {
  
	public static void main(String[] args) {
		   
		LL ll = new LL();
		
		ll.insertNodeFirst(5);
		ll.insertNodeFirst(9);
		ll.insertNodeLast(3);
		ll.insertNodeLast(1);
		ll.insertNodeFirst(20);
		ll.insertNodeLast(10);
		ll.insertAt(3, 99);
		ll.insertAt(3, 98);
		ll.nodeDisplay();
	
	}
	
}
