package x01_Striver_Arrays_Easy;

public class x10_ConsecutinveOnes {
   
	public static void main(String[] args) {
		 
		int[] arr = {1,0,0,1,1,1,0,1,1,1,1};
		
		
		
		int maxCount=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]==1) {
				  count++;
				maxCount= Math.max(maxCount, count);
				 }
			 else {
				 count=0;
			 }
		}
		System.out.println(maxCount);
	}
}
