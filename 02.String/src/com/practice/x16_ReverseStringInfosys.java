package com.practice;

public class x16_ReverseStringInfosys {
	
	public static void main(String[] args) {
		 
		  String str = "Abhimanyu";
		  String str1 ="";
		  
		  for(int i=str.length()-1;i>=0;i--) {
			  str1+=str.charAt(i);
		  }
		System.out.println(str1);
	}

}
