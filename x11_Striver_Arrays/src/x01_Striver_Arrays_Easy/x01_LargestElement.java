package x01_Striver_Arrays_Easy;

public class x01_LargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,12,4,6,7 };
		
		int max =0;
		
	    for(int i =0;i<arr.length;i++) {
	    	        max = Math.max(max, arr[i]);
	    }
	    System.out.println(max);
		
	}

}
