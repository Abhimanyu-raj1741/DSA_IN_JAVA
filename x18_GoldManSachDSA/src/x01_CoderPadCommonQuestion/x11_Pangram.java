package x01_CoderPadCommonQuestion;

import java.util.HashSet;
import java.util.Set;

public class x11_Pangram {
	
	
	public static void  checkPangram(String s) {
		 
		Set<Character> st = new HashSet<>();
		 s = s.toLowerCase();
		 
		 if(s==null || s.isEmpty()) {
			 System.out.println("Not Pangram");
			 return ;
		 }
		
		for(Character  c : s.toCharArray()) {
			 if(c>='a' && c<='z') {
				  st.add(c);
			 }
		}
		System.out.println(st);
		if(st.size()==26) {
			System.out.println("String is Panagram");
			return ;
		}
		else {
		 // System.out.println("String is not panagram");
		}
		//System.out.println("Missing Character");
		StringBuilder sb = new StringBuilder();
		for(char c='a';c<'z';c++) {
			if(!st.contains(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
		
	}
	
	public static void main(String[] args) {
		         String str = "thequickbrownfox jumpsoverthelazydog";
		         
		         checkPangram(str);
		         
		         
		         
	}

}
