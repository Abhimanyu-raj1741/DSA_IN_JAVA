package com.practice;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL(){
		this.size=0;
	}
	
	// insert Node at first position
	  public void insertNodeFirst(int data) {
		  Node node= new Node(data);
		  node.next=   head;
		  head =node;
		  
		  if(tail==null) {
			  tail=head;
		  }
        
		  size+=1;
	  }
	  // insert Node at last position 
	  public void insertNodeLast(int data) {
		  Node node = new Node(data);
		  Node curr= head;
		  while(curr.next!=null) {
			  curr=curr.next;
		  }
		  curr.next=node;
		  size+=1;
		  
	  }
	  // insert Node at index position 
	  public void insertAt(int index , int data)
	  {
		    if(index==0) {
		        insertNodeFirst(data);
		        return;
		    }
		    if(index==size) {
		    	insertNodeLast(data);
		    	return;
		    }
		    
		    Node temp = head;
		    for(int i=1; i<index;i++) {
		    	   
		            temp=temp.next;
		    }
		    
		    Node node= new Node(data,temp.next);
		    temp.next=node; 
		    
		    size+=1;
		    
	  }
	  
	  public void nodeDisplay() {
		   
		   Node temp = head;
		  
		   while(temp!=null) {
			   System.out.print("->"+temp.data);
			   temp=temp.next;
		   }
		   
	  }
	
         
	 private class Node{
		 
		 private int data;
		 private Node next;
		 
		 public  Node(int data){
			 this.data=data;
		 }
		 
		 public Node(int data ,Node next){
			 this.data=data;
			 this.next=next;
		 }
		 
	 }
}
