package x02_Striver_Arrays_Medium;

import java.util.Arrays;

public class x02_SortColors012 {
	
	static void swap(int a, int b,int[] arr  ) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}
	
	public static void main(String[] args) {
		
		// Input: nums = [1, 0, 2, 1, 0]

        // Output: [0, 0, 1, 1, 2]
		
		int[] arr = {1, 0, 2, 1, 0};
		
		// brute force we can take 3 diff array to store 0 1 and 2 
		// and merge them in other array
		 
		// using optimal approach dutch algo using 3 pointer 
		   int n = arr.length;
		   int low =0;
		   int mid =0;
		   int high=n-1;
		   
		   while(mid<high) {
			  if(arr[mid]==0) {
				   swap(low,mid,arr);
				   low++;
				   mid++;
				
			  }
			  else if(arr[mid]==1) {
				  mid++;
			  }
			  else {
				  swap(mid,high,arr);
				  high--;
			  }
		   }
		   
		 System.out.println(Arrays.toString(arr));
	}

}
