package x02_Striver_Arrays_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class x07_LeadersInArray {
           
	public static void main(String[] args) {
		 
//		Input: nums = [1, 2, 5, 3, 1, 2]
//
//				Output: [5, 3, 2]
//
//				Explanation:
//
//				2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
//						
//						
		
		int[] arr = {1, 2, 5, 3, 1, 2};
		
		 // Brute force  
		List<Integer> ls = new ArrayList<>();
		
		boolean flag = false;
		
		for(int i =0;i<arr.length;i++) {
			 flag=true ;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]<arr[j]) {
					 flag=false;
					 break;
				 }
				 
			 }
			 if(flag)ls.add(arr[i]);
		}
		
		System.out.println(ls);
		
		// Optimal approach 
		// iterate from right to left and keep max and store it 
		
		List<Integer> ls1 = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int n =arr.length;
		for(int i=n-1;i>=0;i--) {
			
			if(arr[i]>max) {
				ls1.add(arr[i]);
				max=arr[i];
			}
		}
		Collections.reverse(ls1);
		System.out.println(ls1);
		
		
	}
}
