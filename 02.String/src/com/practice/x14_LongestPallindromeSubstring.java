package com.practice;

public class x14_LongestPallindromeSubstring {
	
	public static boolean checkPall(String s,int i,int j) {
		
		if(i>=j)
			return true;
	    if( s.charAt(i)==s.charAt(j)) {
			 return checkPall(s,i+1,j-1);
		}
		return false ;
			
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "aahomohba";
		
		int maxLen =Integer.MIN_VALUE;
		
		int index =0;
		int last = 0;
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			 for(int j=i;j<n;j++) {
				    
				  if(checkPall(str,i,j)==true) {
					   if(j-i+1>maxLen) {
						   maxLen=j-i+1;
						   index=i;
						   last=j;
					   }
					   
				  }
				   
			 }
		}
		
		System.out.println(index + " "+ maxLen);
		System.out.println(str.substring(index,last+1));
		
	}

}
