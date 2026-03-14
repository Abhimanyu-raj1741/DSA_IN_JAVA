package x01_Striver_Arrays_Easy;

import java.util.Arrays;

public class x07_Move0toEnd {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,0,0,1,1};
		
		int index =0 ;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
			
		}
          for(int i =index;i<arr.length;i++) {
        	     arr[i]=0;
        	     
          }
          System.out.println(Arrays.toString(arr));
	}
	
}
