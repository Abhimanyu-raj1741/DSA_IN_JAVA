package x01_Striver_Arrays_Easy;

import java.util.Arrays;
import java.util.List;

public class x09_FindMissingNumber {
	 
	 public static void main(String[] args) {
		
		 List<Integer> ls = Arrays.asList(0,1,2,3,5);
		 
		 int n =ls.size();
		 int naturalSum=(n*(n+1)/2);
		 int sum  = 0;
		 for(Integer i : ls) sum+=i;
		 
		 System.out.println(naturalSum-sum);
		 
		 
		 
	}

}
