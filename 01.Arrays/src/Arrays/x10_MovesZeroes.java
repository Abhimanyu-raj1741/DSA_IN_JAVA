package Arrays;

public class x10_MovesZeroes {
	
	public static void main(String[] args) {
		
		///int[] arr= {1,1,1,0,1,0,0,1};
		 int[] arr = {0,1,0,3,12};
		int n =arr.length;
	    int  count=0;
		for(int i=0;i<n;i++) {
			  if(arr[i]!=0)
			  arr[count++]=arr[i];
			
			}
		
		while(count<arr.length) {
			arr[count++]=0;
		   
		}
		
		
		
		
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
