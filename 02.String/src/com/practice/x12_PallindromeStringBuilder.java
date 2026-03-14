package com.practice;

public class x12_PallindromeStringBuilder {

	
	public static void main(String[] args) {
		 
		String str = "MOME";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(rev.equals(str))System.out.println("Pallindrome ");
		else System.out.println("Not Pallindrome ");
	}
}
