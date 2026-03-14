package x01_String_Easy;

import java.util.Arrays;

public class x07_Anagram {
	
	public static void main(String[] args) {
//		Example 1:
//			Input: s = "anagram", t = "nagaram"
//			Output: true  
		
		String s = "anagram";
		String t = "nagraam";
		
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1, c2));
		
	}

}
