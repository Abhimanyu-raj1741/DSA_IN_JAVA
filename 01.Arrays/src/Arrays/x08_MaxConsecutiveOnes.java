package Arrays;

public class x08_MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,1,1,1,1,0,0,0};
		
		 int count =0 ;
		 int maxAns =0 ;
		 for( int i : arr) {
			  if(i==1) {
				  count++;
				 maxAns =  Math.max(count, maxAns);
			  }
			  else {
				   count =0 ;
			  }
		 }
		
		
		 System.out.println(maxAns);
		
	
	}
}
