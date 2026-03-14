package x02_Striver_Arrays_Medium;

public class x03_KadanesAlgoMaxSubarraySum {
	
	public static void main(String[] args) {
		  
		// Input: nums = [2, 3, 5, -2, 7, -4]

		// 		Output: 15
		
		int[] arr = {2, 3, 5, -2, 7, -4};
		
		 int maxSum = Integer.MIN_VALUE;
		 int n = arr.length;
		 int sum=0;
		 for(int i =0; i<n;i++) {
			 sum+=arr[i];
			 
			 if(sum>maxSum) {
				 maxSum = sum;
			 }
			 
			 if(sum<0) {
				 sum=0;
			 }
				 
		 }
		 
		 System.out.println(maxSum);
		
	}

}
