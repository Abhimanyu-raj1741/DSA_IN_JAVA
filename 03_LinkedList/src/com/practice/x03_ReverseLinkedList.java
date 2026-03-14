package com.practice;

import com.practice.x02_MiddleOfLinkedList.Node;

public class x03_ReverseLinkedList {
	
	
	static class Node {
		  int data ;
		  Node next;
		  
		  Node(int data){
			  this.data = data;
			  this.next =null;
		  }
		  
		 
	}
    
    
    public static Node reverseLink(Node head) {
  	    
    	       Node prev =null;
    	       Node curr = head;
    	       while(curr!=null) {
    	    	    Node temp = curr.next;
    	    	    curr.next=prev;
    	    	    prev =curr;
    	    	    curr =temp;
    	       }
  	     
    	       return prev;
  	      
    }
   public static void show( Node head) {
	    
	   Node temp = head;
	   
	   while(temp!=null) {
		     System.out.print(temp.data + " ");
		     temp =temp.next;
	   }
	   System.out.println();
   }
	public static void main(String[] args) {
		 Node head = new Node(10);
		 Node second = new Node(20);
		 Node third = new Node(30);
		 Node fourth = new Node(40);
		 Node fifth = new Node(50);
		 Node sixth = new Node(60);
		 
		 head.next =second;
		 second.next=third;
		 third.next=fourth;
		 fourth.next=fifth;
		 fifth.next=sixth;
		 show(head);
		  Node add = reverseLink(head );
		  show(add);
		 

}
}