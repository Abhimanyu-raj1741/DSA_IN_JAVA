package com.practice;

public class x11_ReverseEachWordSentence {
	
	 public static String reverseWord(String str ) {
		 
		    String[] split = str.split(" ");
		    StringBuilder sb = new StringBuilder();
		    
		    for(String s: split) {
		    	String temp =new StringBuilder(s).reverse().toString();
		    	sb.append(temp);
		    	sb.append(" ");
		    	
		    	
		    }
		 
		 
		 return sb.toString();
	 }
	
	 public static void main(String[] args) {
		 
		 String str = "THIS IS ABHIMANYU KUMAR";
		 
		 System.out.println(reverseWord(str));
		  
	}

}
