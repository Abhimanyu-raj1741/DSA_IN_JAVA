package com.practice;

import java.util.Arrays;

public class x17_LongestSubStringNonRepeating {
	
	public static void main(String[] args) {
		 
		String s = "adeaaaacdf";
		int[] hash = new int[256];
		Arrays.fill(hash, -1);
		int l =0;
		int r=0;
		int maxLen =0;
		int n =s.length();
		String ans="";
		while(r<n) {
			if(hash[s.charAt(r)]!=-1) {
				if(hash[s.charAt(r)]>=l) {
					l = hash[s.charAt(r)]+1;
				}
			}
			int len = r-l+1;
			
			if(len>maxLen)
			{
				ans = s.substring(l,r+1);
				maxLen = Math.max(len, maxLen);
			}
		     
			hash[s.charAt(r)]=r;
			r++;
		}
		System.out.println(ans);
		System.out.println(bruteForce(s));
		for(int i : hash) {
			if(i!=-1)
				System.out.println(i);
		}
		System.out.println(Arrays.toString(hash));
	}
   
	 public static String bruteForce(String s) {
		 
		 
		 int n = s.length();
		 
		 int maxlen =0;
		 String res ="";
		 for(int i=0;i<n;i++) {
			 int[] hash = new int[256];
			 Arrays.fill(hash,-1);
			 for(int j=i;j<n;j++) {
				 if(hash[s.charAt(j)]==1) {
					 break ;
				 }
				 int len = j-i+1;
				 if(maxlen<len) {
					 res = s.substring(i,j+1);
					 maxlen = len ;
							 
				 }
				 hash[s.charAt(j)]=1;
			 }
		 }
		 return res;
		 
	 }
} 

