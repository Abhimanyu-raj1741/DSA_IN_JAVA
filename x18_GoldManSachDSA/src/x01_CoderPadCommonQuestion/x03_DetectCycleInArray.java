package x01_CoderPadCommonQuestion;

import java.util.HashMap;

public class x03_DetectCycleInArray {
	public static void main(String[] args) {
		
		 int[] arr = {1,2,3,4,2};
		 
		 int startIndex =0;
		 
		 System.out.println("Steps Taken " + detectCycle(arr,startIndex));
	}
  
	public static int detectCycle(int[] arr,int startIndex) {
		
		 
	     int start = startIndex;
	     int end = startIndex;
	     boolean isloop = false ;
	     int length =0;
	     while(start<arr.length && end<arr.length) {
	    	     start = arr[start];
	    	     end = arr[arr[end]];
	    	     if(start == end) {
	    	    	  isloop = true;
	    	    	  break ;
	    	     }
	     }
	     if(isloop) {
	    	 end = arr[end];
	    	 length=1;
	    	 while(start!=end) {
	    		 end = arr[end];
	    		 length += 1; 
	    		 
	    	 }
	     }
	     return length;
	}
}
