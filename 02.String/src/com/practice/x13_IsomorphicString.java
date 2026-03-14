package com.practice;

public class x13_IsomorphicString { 
	
	public static boolean checkIso(String str1, String str2) {
		
		int[] arr = new int[200];
		int[] arr1 = new int[200];
		
		int len=str1.length();
		
		if(len!=str2.length())return false;
		
		for(int i=0;i<len;i++) {
			if (arr[str1.charAt(i)]!=arr1[str2.charAt(i)])
				return false ;
			
			arr[str1.charAt(i)]=i+1;
			arr1[str2.charAt(i)]=i+1;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "paper";
		String r = "title";
		
		System.out.println(checkIso(s,r));
		
	}

}
