package x01_Learning;

import java.util.Stack;

public class x05_BalancedParanthesis {
	
	public static void main(String[] args) {
//		Example 1:
//			Input: s = "()"
//			Output: true
//			Example 2:
//			Input: s = "()[]{}"
//			Output: true
//			Example 3:
//			Input: s = "(]"
//			Output: false
		
		String s = "()[]{{}{}}{";
		
		Stack<Character> st = new Stack<>();
		
		boolean ans;
		for( Character c :  s.toCharArray()) {
			if(c=='[')st.push(']');
			else if (c=='(') st.push(')');
			else if(c=='{')st.push('}');
			
			else if (st.isEmpty() || st.pop()!=c)
				ans =false ;
			
		}
		ans= st.isEmpty();
		
		System.out.println(st);
		System.out.println(ans);
	}
	

}
