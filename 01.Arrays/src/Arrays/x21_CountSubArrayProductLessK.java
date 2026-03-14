package Arrays;

public class x21_CountSubArrayProductLessK {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int k=10;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int prod =1;
			for(int j=i;j<arr.length;j++) {
				prod*=arr[j];
				if(prod<k) {
					count++;
				}
			}
			
			 
		}
		System.out.println(count);
	}
}
