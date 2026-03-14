package x01_CoderPadCommonQuestion;

public class x16_PrimeFactor {
	
	  public static void main(String[] args) {
		  
		  int n=60; 
		  // 2 2 3 5 
		  // 30  15 5 
		  for(int i =2 ;i*i<=n;i++) {
			   
			  while(n%i==0) {
				  System.out.println( i + " ");
				  n=n/i;
			  }
		  }
		  if(n>1) {
			  System.out.println(n);
		  }
		  
	}

}
