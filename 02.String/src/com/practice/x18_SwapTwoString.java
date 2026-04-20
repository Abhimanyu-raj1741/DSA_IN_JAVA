package com.practice;

public class x18_SwapTwoString {
	
	public static void main(String[] args) {
		 
		String a = "Hello";
		String b = "World";
		
		a = a+b;
		b = a.substring(0,b.length());
		a = a.substring(b.length());
		System.out.println(a+ " "+ b);
	}

}
