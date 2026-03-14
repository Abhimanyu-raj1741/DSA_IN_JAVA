package x01_Striver_Arrays_Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class x06_LeftRotateArrayByDPlace {
    
	public static void main(String[] args) {
//		Input: nums = [1, 2, 3, 4, 5, 6], k = 2
//
//		Output: nums = [3, 4, 5, 6, 1, 2]
		
		 List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6);
		 int k =2 ;
		 int n=ls.size();
		 Collections.reverse(ls.subList(0,k));
		 Collections.reverse(ls.subList(k, n));
		 Collections.reverse(ls);
		 
		 System.out.println(ls);
		 
		
	}
	
}
