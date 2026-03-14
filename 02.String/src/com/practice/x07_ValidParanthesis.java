package com.practice;

import java.util.Stack;

public class x07_ValidParanthesis {
	public static boolean isValid(String str) {
		 Stack<Character> st = new Stack<>();
	        
	        for(Character c : str.toCharArray()) {
	        	
	        	if(c=='(') {
	        		st.push(c);
	        	}
	        	
	        	else if(c==')') {
	        		if(st.isEmpty()) return false;
	        	    	st.pop();
	        	}
	        }
	        return st.isEmpty();
	}
	
	public static void main(String[] args) {
		
		boolean validpar=false;

		String str ="())";
       
        if(isValid(str))System.out.println(" Valid ");
        else System.out.println("not valid");
     

	}
}
