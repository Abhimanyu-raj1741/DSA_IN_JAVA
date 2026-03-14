package com.practice;

public class x06_NonRepeatingChar {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		
		int n= str.length();
		
		// Brute Force
		char c =' ';
		for(int i=0;i<n;i++) {
			boolean found =false;
			for(int j=i+1;j<n;j++){
				if(str.charAt(i)==str.charAt(j))
				{    
					found =true;
					
				}
			
			}
			if(!found) {
				c=str.charAt(i);
				System.out.println(c);
				break;
			}
		}
		 if(c==' ')System.out.println("Not found");
		 
		 // Better approach   by Frequency count 
		 
		 int[] arr = new int[26];
		 
		  for(Character z : str.toCharArray()) {
			     arr[z-'a']++;
		  }
		  
		  for(Character r : str.toCharArray()) {
			   if(arr[r-'a']==1) {
				   System.out.println(r);
				   break;
			   }
		  }
		 
	}

}
