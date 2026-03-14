package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class x04_2ndLargestElement {

	public static void main(String[] args) {
		
		// Brute Force 
		List<Integer> ls = Arrays.asList(1,2,4,7,7,5,8,8,9,9,9);
		
		Collections.sort(ls);
		int n = ls.size();
		int secondMax = ls.get(n-1);
		for(int i=n-2;i>=0;i--) {
			if(ls.get(i)<secondMax) {
				secondMax=ls.get(i);
				break;
			}
		}
		System.out.println(secondMax);
		
		// Better  Approach 2 Pass
		
		// finding max first  1 pass 
		 int max = ls.get(0);
		  for(int i=0 ; i<n;i++) {
			  max = Math.max(ls.get(i),max);
			  
		  }
		 // find second largest 
		  int secLarge = -1;
		 for(int i=0;i<n;i++) {
			 if(ls.get(i)<max) {
				 secLarge=ls.get(i);
			 }
		 }
		 
		System.out.println(secLarge);
		int[] arr = {2,4,7,7,5,8,8,9,9,9};
		
		// Optimal Approach
		 int secLarg =-1;
	     int larg=arr[0];
	     
	     for(int i=1;i<arr.length;i++) {
	    	     if(arr[i]>larg) {
	    	    	 secLarg = larg;
	    	    	 larg =arr[i];
	    	    	 
	    	     }
	    	    	  
	    	     
	    	     else if(arr[i]>larg && arr[i]>secLarg) {
	    	    	      secLarg =arr[i];
	    	     }
	     }
		 System.out.println(secLarg);
	}
}
