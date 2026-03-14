package x02_String_Medium;

public class x02_LongestPallindromicSubstring {
	public static boolean isPallindrome(String s) {
		 int left =0;
	     int right =s.length()-1;
	     while(left<right) {
	    	      if(s.charAt(left)!=s.charAt(right)) 
	    	      {
	    	    	     return false; 
	    	      }
	    	 left++;
	    	 right--;
	     }
		 return true;
	}
    
	public static void main(String[] args) {
//		Example 1:
//			Input: s = "babad"
//			Output: "bab"
//			Explanation: "aba" is also a valid answer.
//			Example 2:
//			Input: s = "cbbd"
//			Output: "bb"
		 String s = "bamomomd";
		 int maxLen = Integer.MIN_VALUE;
		 int n = s.length();
		 int first =0;
		 int last =0;
		 String ans ="";
		 for(int i=0;i<n;i++) {
			 for(int j=i;j<n;j++) {
				  if(isPallindrome(s.substring(i,j+1))==true) {
					  if(j-i+1 >maxLen) {
						  maxLen=j-i+1;
						  ans =s.substring(i,j+1);
					  }
				  }
			 }
		 }
		 System.out.println(ans);
		 
		 
		 
		
	}
	
}
