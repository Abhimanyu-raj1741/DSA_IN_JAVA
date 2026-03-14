package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class x05_RemoveDuplicateFromSortedArray {
	
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,1,2,2,2,3,3);
		
		// Brute Force
		Set<Integer> hs = new HashSet<>();
		
		for(Integer i : ls) {
			hs.add(i);
		}
		int index =0;
		for(Integer i :hs) {
			ls.set(index, i);
			index++;
		}
		for(int i =0;i<hs.size();i++)
	    System.out.println(ls.get(i));
		System.out.println("---------------------");
		
		// Optimal Approach
		int n = ls.size();
		int a =0;
		
		for(int j=1;j<n;j++ ) {
			if(ls.get(a)<ls.get(j)) {
				a++;
				ls.set(a,ls.get(j));
				
			}
			
		}
		for(int i =0;i<=a;i++)
		{
		      System.out.println(ls.get(i));
		}
		
	} 

}
