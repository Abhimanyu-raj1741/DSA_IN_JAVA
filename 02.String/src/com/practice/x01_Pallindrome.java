package com.practice;

public class x01_Pallindrome {

	 public static void main(String[] args) {
		
		 String str = "MAMA";
		 
		 boolean ans = true;
		 
		 int last = str.length()-1;
		 
		 for(int i=0;i<str.length()/2;i++) {
			 
			 if(str.charAt(i)!=str.charAt(last)) {
				 ans=false;
				 break;
			 }
			 last--;
		 }
		 if(ans) System.out.println("Pallindrome ");
		 else 
			 System.out.println("Not Pallindrome");
	}
	 
	
	
}
