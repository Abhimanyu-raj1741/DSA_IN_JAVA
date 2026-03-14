package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class x15_LeftRotateArrayByKPlace {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		
		
		int d = 3;
		
		// OUTPUT { 4 5 6 7 1 2 3 }
		
		
		int[] temp = Arrays.copyOfRange(arr,0,d);
	    
		int n =arr.length;
		
		d=d%n;
		
		for(int i =d;i<n;i++) {
			
			arr[i-d]=arr[i];
		}
		int j = 0;
		for(int i=n-d;i<n;i++) {
			 arr[i]=temp[j];
			 j++;
		}

		for(int i=0;i<n;i++)
		System.out.print(arr[i]+ " ");
		
		// Space Complexity O(d)
		// Time Complexity O (n+d)
		
		System.out.println();
		
		
		// OPTIMAL   Space O(1) and Time  O(2n)
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7);
		
		Collections.reverse(ls.subList(0, d));
		Collections.reverse(ls.subList(d,n));
		Collections.reverse(ls);
		
		for(Integer a :ls) {
			System.out.print(a + " ");
		}
		
		
		
	}

}
