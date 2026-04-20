package com.practice;

public class x01_LinkedListImpl {
	  
	 class Node{
		 int data;
		 Node next;
		 
		 Node(int data ){
			 this.data = data ;
			 this.next=null;
					
		 }
		 
		 
	 }
	Node head;
	
	public  void insertFirst(int data) {
		Node newNode = new Node(data);
	
		
		newNode.next=head;
		head=newNode;
		
		
	}
	public  void insertLast(int data) {
		Node newNode = new Node(data);
	      if(head==null) {
	    	     head=newNode;
	    	     return;
	      }
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		
		
	}
	public void insertPos(int data,int index) {
		  if (index == 0) {
		        insertFirst(data);
		        return;
		    }

		    Node temp = head;
		    int i = 0;

		    while (temp != null && i < index - 1) {
		        temp = temp.next;
		        i++;
		    }

		    if (temp == null) {
		        System.out.println("Invalid index");
		        return;
		    }

		    Node newNode = new Node(data);
		    newNode.next = temp.next;
		    temp.next = newNode;
		
		
	}
	
	public void deleteLast() {
		
		   if (head == null) {
		        System.out.println("List is empty");
		        return;
		    }

		    if (head.next == null) {
		        head = null;
		        return;
		    }

		    Node temp = head;
		    while (temp.next.next != null) {
		        temp = temp.next;
		    }

		    temp.next = null;
      		
	}
	public void search(int data) {
		  int index = 0;
		    Node temp = head;

		    while (temp != null) {
		        if (temp.data == data) {
		            System.out.println("Find at Index " + index);
		            return;
		        }
		        temp = temp.next;
		        index++;
		    }

		    System.out.println("Not Found");
	}
	
	public void showNode() {
		Node temp =head;
		while(temp!=null) {
			System.out.print("["+temp.data+"]"+" ");
			temp =temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
	  x01_LinkedListImpl node = new x01_LinkedListImpl();
	
	  node.insertFirst(34);
	  node.insertFirst(24);
	  node.insertFirst(14);
	  node.insertLast(44);
	  node.insertPos(222, 4);
	  node.showNode();
	  node.search(44);
	  node.deleteLast();
	  node.showNode();
	//node.deleteFirst();
		node.showNode();
	}

}
