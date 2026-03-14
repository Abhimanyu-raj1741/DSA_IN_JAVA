package x02_Striver_Arrays_Medium;

public class x04_KadanesAlgoMaxSubArraySumExtended {
 
	public static void main(String[] args) {
		  
		// Input: nums = [2, 3, 5, -2, 7, -4]

				// 		Output: 15
				
		// In this we print  the Subarrays
				int[] arr = {2, 3, 5, -2, 7, -4};
				
				 int maxSum = Integer.MIN_VALUE;
				 int n = arr.length;
				 int sum=0;
				 int ansFirst =-1;
				 int ansEnd =-1;
				 int start=-1;
				 for(int i =0; i<n;i++) {
					 if(sum==0) {
						 start=i;
					 }
					 sum+=arr[i];
					 
					 
					 if(sum>maxSum) {
						 maxSum = sum;
						 ansFirst=start;
						 ansEnd=i;
					 }
					 
					 if(sum<0) {
						 sum=0;
					 }
						 
				 }
				 
				 System.out.println(maxSum);
				 for(int i=ansFirst;i<ansEnd;i++) {
					 System.out.print(arr[i]);
				 }
	}
	 
}
