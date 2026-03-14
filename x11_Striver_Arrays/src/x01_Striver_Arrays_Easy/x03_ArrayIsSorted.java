package x01_Striver_Arrays_Easy;

public class x03_ArrayIsSorted {
  public static void main(String[] args) {
	
	  int[] arr = {1,1,2,1,3,3,4};
	  
	  boolean ans = false; 
	  
	  for(int i=1;i<arr.length;i++) {
		   
		  if(arr[i]>=arr[i-1]) {
			  
		  }
		  else 
		  {
			  ans = false;
			  break;
		  }
		  ans = true ;
	  }
	   System.out.println(ans);
}
}
