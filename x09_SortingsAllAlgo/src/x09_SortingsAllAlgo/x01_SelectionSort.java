package x09_SortingsAllAlgo;

import java.util.Arrays;

public class x01_SelectionSort {
	
	static int[] sortSelection(int[] arr) {
		
		
		int n =arr.length;
		for(int i=0;i<=n-2;i++) {
			int mini =i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[mini])
                 mini =j;
				
			}
			int temp = arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
		
		return arr;
		
		
	}
  
	public static void main(String[] args) {
		
		int[] arr = {13,46,24,52,20,9};
		
		int[] ans = sortSelection(arr);
		
		System.out.println(Arrays.toString(ans));
	}
	
	
}
