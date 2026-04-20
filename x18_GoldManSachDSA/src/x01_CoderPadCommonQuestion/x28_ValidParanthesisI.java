package x01_CoderPadCommonQuestion;

import java.util.Stack;

public class x28_ValidParanthesisI {
	 
	  public static void main(String[] args) {
		    String s = "((()))";

	        Stack<Character> st = new Stack<>();

	        boolean ans = true;

	        for(char c : s.toCharArray()) {

	            if(c == '{') st.push('}');
	            else if(c == '[') st.push(']');
	            else if(c == '(') st.push(')');
	            else {

	                if(st.isEmpty() || st.pop() != c) {
	                    ans = false;
	                    break;
	                }
	            }
	        }

	        if(!st.isEmpty()) ans = false;

	        System.out.println("Stack: " + st);
	        System.out.println("Valid: " + ans);
	}

}
