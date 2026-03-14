package x02_Striver_Arrays_Medium;

public class x05_BuyAndSellStock {
   
	public static void main(String[] args) {
		 
//		Input: arr = [10, 7, 5, 8, 11, 9]
//
//				Output: 6
//
//				Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.
//		
		int[] arr = {10, 7, 5, 8, 11, 9};
//		
		 int maxProfit = -1;
	       int minPrice =Integer.MAX_VALUE ;
	       int maxPrice = Integer.MIN_VALUE; 
	     
	      for( int i =0 ;i< arr.length;i++){
	             minPrice = Math.min(minPrice,arr[i]);
	            int profit = arr[i] -minPrice;
	            if(profit>maxProfit ){
	                 maxProfit = profit; 
	            }
	      }
	     System.out.println(maxProfit); 
	     
	     
	}
}
