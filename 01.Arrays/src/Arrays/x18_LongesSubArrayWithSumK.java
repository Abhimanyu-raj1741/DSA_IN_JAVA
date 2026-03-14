package Arrays;

public class x18_LongesSubArrayWithSumK {
 
	 
	 public static void main(String[] args) {
		  int[] arr = {1,2,3,1,1,1,0,2,3};
		  
		  int k = 3;
		  int n = arr.length;
		  int len =0;
		  int first=0;
		  int last=0 ;
		  // Brute Force O(n2)
		  for(int i=0;i<n;i++) {
			  int sum=0;
			  for(int j=i;j<n;j++) {
				   
					  sum+=arr[j];
					
				  if(sum==k) {
					  if(len<(j-i+1)) {
						  first =i;
						  last=j;
					  }
					  len=Math.max(len,j-i+1);
				  }
			  }
		  }
		  System.out.println(len);
		  for(int i=first;i<=last;i++) {
			  System.out.print(arr[i]);
		  }
		  
		  
		  
	}
	
}
