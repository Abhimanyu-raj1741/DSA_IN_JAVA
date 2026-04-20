package x02_CoderPadMediumQuestions;

public class x01_KokoEatingBanana {
	public static void main(String[] args) {
		int[] arr = {3,6,7,11};
		int hours = 8;
		
		int ans = binarySearch(arr,hours);
		
		System.out.println(ans);
	}
	
	public static int binarySearch(int[] arr,int hours) {
		  
		 int max = -1 ;
		 for(int i :arr ) {
			  max = Math.max(i, max);
		 }
		 boolean isAns=false;
		 int low = 1;
		 int high =max;
		 int minBana=max;
		 while(low<=high) { 
			  int mid = (low+high)/2;
			  isAns = findMin(mid,arr,hours);
			  if(isAns ) {
				  minBana=mid;
				  high=mid-1;
			  }
			  else {
				   low =mid+1;
			  }
			  
			  
		 }
		 return minBana;
		  
	}
	
	public static boolean findMin(int speed ,int[] arr,int hours) {
		     long hrs =0;
		     for(int piles:arr) {
		    	    hrs +=  (long)Math.ceil((double)piles/speed);
		     }
		     return hrs<=hours ;
		     
		
	}

}
