package com.practice;

public class x04_ReterivePinCodeFromString {
	public static void main(String[] args) {
		
		String str = " Keshalpur Colliery Dhanbad 828114 9934370711";
		
		
		
		String[] split = str.split(" ");
		
		for(String s : split) {
			s.trim();
			if(s.length()==6 && equalDigit(s)) {
				System.out.println(s);
			}
		}
		
	}
	
	public static boolean equalDigit(String s) {
		
		   for(Character c : s.toCharArray()) {
			   if(!Character.isDigit(c)) {
				   return false ;
			   }
		   }
		 return true;
	}

}
