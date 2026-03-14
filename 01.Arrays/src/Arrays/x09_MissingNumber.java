package Arrays;

public class x09_MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {9,6,4,2,3,5,7,0,1};
		int n = arr.length;
		int actualSum=(n*(n+1)/2);
		int sum=0;
		for(int j=0;j<n;j++)
			sum+=arr[j];
		
		System.out.println("Missing Number ");
		System.out.println(actualSum-sum);
	}
}
