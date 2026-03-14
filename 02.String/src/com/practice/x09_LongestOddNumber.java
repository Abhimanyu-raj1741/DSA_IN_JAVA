package com.practice;

public class x09_LongestOddNumber {

	   public static String largestOddNumber(String num) {
	         int len = num.length();
	        for (int i = len - 1; i >= 0; i--) {
	            if (num.charAt(i) % 2 != 0) {
	                return num.substring(0, i + 1);
	            }
	        }
	        return "";
	       
	    }
	   
	   public static void main(String[] args) {
		 
		   String str = "21254";
		   // String str = "652 "; op ->65
		    // String str = "24 "; op -> " "
		   
		   System.out.println(largestOddNumber(str));
	}
}
