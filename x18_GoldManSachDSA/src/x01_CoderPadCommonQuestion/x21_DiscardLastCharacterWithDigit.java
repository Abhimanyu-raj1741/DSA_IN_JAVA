package x01_CoderPadCommonQuestion;

import java.util.Stack;

public class x21_DiscardLastCharacterWithDigit {
    
	 public static void main(String[] args) {
		 String str = "asddd2sad24";
		 
		 Stack<Character> st = new Stack<>();
		 
		 for(Character c:str.toCharArray() ) {
			  
			  if(Character.isDigit(c)) {
				  if(!st.isEmpty()) {
					  st.pop();
				  }
			  }
			  else {
				  st.add(c);
			  }
		 }
		 StringBuilder sb = new StringBuilder();
		 while(!st.isEmpty()) {
			 sb.append(st.pop());
		 }
		 System.out.println(sb.reverse());
	}
}
