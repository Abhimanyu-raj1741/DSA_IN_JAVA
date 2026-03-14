package Arrays;

import java.util.Arrays;

public class x22_MergeTwoUnsortedArray {
	
	public static void main(String[] args) {
		 
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,4,6};
		
		int[] result = new int[arr1.length+ arr2.length];
		int n1 =arr1.length;
		int n2 =arr2.length;
		
		int i =0;
		int j=0;
		int k=0;
		while(i<n1 && j<n2) {
			 if(arr1[i]<arr2[j]) {
				 result[k++] =arr1[i++];
			 }
			 else {
				 result[k++] =arr2[j++];
			 }
			 
				 
		}
		while(i<n1) result[k++]= arr1[i++];
		while(j<n2) result[k++]=arr2[j++];
		System.out.println(Arrays.toString(result));
		
	}

}
