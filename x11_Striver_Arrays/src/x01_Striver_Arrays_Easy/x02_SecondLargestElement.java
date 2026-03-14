package x01_Striver_Arrays_Easy;

public class x02_SecondLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,7,7,5,8,8,9,9,9,11,1};
		
		int n = arr.length;
		
		
		// Optimal approach 
	    int secLarg =-1;
	    int larg =arr[0];
	    
	    for(int i =1;i<n;i++) {
	    	     if(arr[i]>larg) {
	    	    	 secLarg=larg;
	    	    	 larg=arr[i];
	    	     }
	    	     else if(arr[i]<larg && arr[i]>secLarg) {
	    	    	 secLarg=arr[i];
	    	     }
	    }
		System.out.println(secLarg);
		
	}

}
