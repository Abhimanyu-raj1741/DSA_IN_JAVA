package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class x03_LargestElementInArray {
 
	public static void main(String[] args) {
		
		// Brute Force
		int[] arr = {1,6,10,15,18,4,0};
		
		List<Integer> list = Arrays.asList(1,6,10,15,18,4,0);
		
		Collections.sort(list);
		
		int size =list.size() -1;
		System.out.println(list.get(size));
		
	  // Optimal Approach 
		List<Integer> ls= Arrays.asList(1,6,10,15,18,4,0);
		
		 int max=ls.get(0);
		 for(Integer i :ls) {
			    max=Math.max(max,i);
		 }
		System.out.println(max);
	}
}
