package Arrays;

import java.util.Arrays;
import java.util.List;

public class x06_RunningSumOf1DArray {
	
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		int sum=0;
		for(int i=0;i<ls.size();i++) {
			 sum+=ls.get(i);
			 ls.set(i,sum);
		}
			
		for(Integer i:ls) {
			System.out.println(i);
		}
		 
	}

}
