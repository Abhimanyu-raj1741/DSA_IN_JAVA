package Arrays;

public class x16_BestTimetoBuyAndSellStock {
	
	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		
		 // Brute Force
		int max = 0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			   int min=arr[i];
			for(int j =i+1;j<n;j++) {
				  int profit= arr[j]-min;
				 max = Math.max(max,profit);
				  
			}
		}
		
		System.out.println(max);
	 // Optimal 	
	  int min = arr[0];
	  int maxProfit=0;
	  for(int i =1;i<n;i++) {
		 min =  Math.min(min,arr[i]);
		 int profit = arr[i]-min;
		 maxProfit = Math.max(maxProfit,profit);
	  }
		  System.out.println(maxProfit);
	
	}

}
