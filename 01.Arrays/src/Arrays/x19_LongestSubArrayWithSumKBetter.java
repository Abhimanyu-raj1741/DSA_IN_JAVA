package Arrays;

import java.util.HashMap;

public class x19_LongestSubArrayWithSumKBetter {
	
	 public static void main(String[] args) {
		
		 int[] arr = {1,2,3,1,1,1,0,0,2,3};
		  //int[] arr = {2,0,0,3};   //Edge case
		 int k=3;
		 
		 HashMap<Integer,Integer> hp = new HashMap<>();
		 int length=0;
		 int preSum=0;
		 
		 for(int i =0;i<arr.length;i++) {
			 preSum+=arr[i];
			 if(preSum==k) {
				 length=Math.max(length, i+1);
				 
			 }
			 if (hp.containsKey(preSum-k)){
				 length=Math.max(length,i-hp.get(preSum-k));
				 
				 
			 }
			 if(!hp.containsKey(preSum))
			 hp.put(preSum,i);
		 }
		 System.out.println(length);
		 
	}

}
