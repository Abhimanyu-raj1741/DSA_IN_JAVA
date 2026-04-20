package Arrays;

import java.util.HashMap;

public class x11_TwoSum {
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15,4};
		int target = 6;
		
		// return the index of number which sum = 9
		// Brute Force 
		int a=0;
		int b=0;
		 int n = arr.length;
		for(int i =0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				  if( arr[i]+arr[j]==target) {
					  a=i;
					  b=j;
				  }
			}
		}
		System.out.println(a + " " +b);
		
		//Better approach using Hashmap its variety 2 question
		  HashMap<Integer,Integer> hm = new HashMap<>();
		  
		  for(int i =0 ; i<n;i++) {
			  
			  int require = target - arr[i];
			  if(hm.containsKey(require)) {
				  a=hm.get(require);
				  b=i;
			  }
			  else {
				  
				  hm.put(arr[i],i);
			  }
			  
		  }
		  System.out.println(a + " " +b);
		 
		
	}

}
