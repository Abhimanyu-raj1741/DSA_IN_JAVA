package x03_MonotonicStackAndQueueProblem;

import java.util.Arrays;
import java.util.Stack;

public class x01_NextGreaterElement {
	
	    public static int[] nextGreaterEle(int[] arr) {
	    	   
	    	  int n =arr.length ;
	    	   Stack<Integer> st = new Stack<>();
	    	   int[] ans = new int[n];
	    	   
	    	   for(int i=n-1; i>=0;i--) {
	    		    
	    		   while(!st.isEmpty() && st.peek()<=arr[i]) {
	    			    st.pop();
	    		   }
	    		   if(st.isEmpty()) ans[i]=-1;
	    		   else {
	    			    ans[i] = st.peek();
	    		   }
	    		   st.push(arr[i]);
	    	   }
	    	   
	    	   return ans;
	    }
	 
	
	public static void main(String[] args) { 
		 
		    int[] arr  = {4,12,5,3,1,2,5,3,1,2,4,6};
		    
		    int[] ans  =  nextGreaterEle(arr);
		    System.out.println(Arrays.toString(ans));
		
	}

}
