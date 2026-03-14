package x02_Striver_Arrays_Medium;

import java.util.Arrays;

public class x06_RearrangeElementBySign {
   
	public static void main(String[] args) {
		
//		Input : nums = [2, 4, 5, -1, -3, -4]
//
//				Output : [2, -1, 4, -3, 5, -4]
//
//				Explanation:
//
//				The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
//		
		int[] nums = {2, 4, 5, -1, -3, -4};
		
		int n = nums.length ; 
		int[] arr = new int[6];
		
		int posIndex = 0;
		int negIndex = 1;
		
		for(int i =0;i<n;i++) {
			
			if(nums[i]<0) {
				arr[negIndex]=nums[i];
				negIndex+=2;
			}
			else {
				arr[posIndex]=nums[i];
				posIndex+=2;
			}
				
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
