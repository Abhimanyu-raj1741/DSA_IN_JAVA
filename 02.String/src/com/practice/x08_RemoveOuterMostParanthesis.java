package com.practice;

public class x08_RemoveOuterMostParanthesis {
	
	   public static String removeOuterParenth(String str) {
	          StringBuilder s = new StringBuilder();
	        int opened = 0;
	        for (char c : str.toCharArray()) {
	            if (c == '(' && opened++ > 0) s.append(c);
	            if (c == ')' && opened-- > 1) s.append(c);
	        }
	        return s.toString();
	   }
            
	public static void main(String[] args) {
		
		    String str = "(())";
		    
		    System.out.println(removeOuterParenth(str));
		     
	}
}
