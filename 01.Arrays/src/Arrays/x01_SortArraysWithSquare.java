package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class x01_SortArraysWithSquare {
   
	
	public static void main(String[] args) {
		// BRUTE FORCE 
		ArrayList<Integer> rs = new ArrayList<>();
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(-6, -3, -1, 2, 4, 5));

		for(Integer r : ls) {
			 rs.add(r*r);
		} 
		
	    Collections.sort(rs);
	    
		System.out.println(rs);		
		
		// OPTIMAL APPROACH
		int[] arr = {-6, -3, -1, 2, 4, 5};
		
	    
	    int head=0 ;
	    int tail=arr.length-1;
	    
	    int[] arr1 = new int[arr.length];
	    
	    for(int pos=arr.length-1;pos>=0;pos--) {
	    	
	    	if(arr[head]>arr[tail])
	    	{
	    		arr1[pos]=arr[head];
	    		head++;
	    	}
	    	else {
	    		arr1[pos]=arr[tail];
	    		tail--;
	    	}
	    }
	    for(int i=0;i<arr1.length;i++)
	    {
	    	System.out.println(arr1[i]);
	    }
	    
	} 
}
