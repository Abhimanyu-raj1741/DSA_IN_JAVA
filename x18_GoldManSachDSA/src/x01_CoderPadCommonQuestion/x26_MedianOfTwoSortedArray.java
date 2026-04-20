package x01_CoderPadCommonQuestion;

import java.util.Arrays;

public class x26_MedianOfTwoSortedArray {
	
	
	         public static void main(String[] args) {
	        	 int[] A = { 1,3,7,8};
	        	 int[] B = {2,4};
	        	 int[] C = new int[A.length+B.length];
	        	 System.arraycopy(A,0,C,0,A.length);
	        	 System.arraycopy(B, 0, C, A.length, B.length);
	        	 
	        	 Arrays.sort(C);
	        	 
	        	 int len= C.length;
	        	 double ans = 0;
	        	 
	        	 if(len%2==0) {
	        		    ans = (C[len/2]+C[len/2-1])/2.0;
	        	 }
	        	 else {
	        		  ans = C[len/2];
	        	 }
	        	 
	        	 System.out.println(ans);
			}
	
}
