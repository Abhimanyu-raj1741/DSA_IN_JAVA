package x01_String_Easy;

public class x05_IsomorphicString {
	
	public static void main(String[] args) {
//		Example 1:
//			Input: s = "egg", t = "add"
//			Output: true
//		Example 2:
//			Input: s = "f11", t = "b23"
//			Output: false
//			Explanation:
//			The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
//	    Example 3:
//			Input: s = "paper", t = "title"
//			Output: true
		   String s ="paper";
		   String t ="title";
		   
		   
		   int[] indexS = new int[255];
		   int[] indexT = new int[255];
		   
		   boolean result = true; 
		   if(s.length()!=t.length()) result =false;
		   
		   for(int i=0;i<s.length();i++) {
			   if(indexS[s.charAt(i)]!=indexT[t.charAt(i)]) {
				   result=false;
				   break;
			   }
			   
				   indexS[s.charAt(i)]=i+1;
				   indexT[t.charAt(i)]=i+1;
			   
		   }
		   
		   System.out.println(result);
		
		
		
	}

}
