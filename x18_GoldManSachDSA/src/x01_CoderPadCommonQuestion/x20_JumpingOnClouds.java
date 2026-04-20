package x01_CoderPadCommonQuestion;

public class x20_JumpingOnClouds { 
	
	public static void main(String[] args) {
		  
		int[] input = {0,1,0,0,0,1,0};
	     
		 int jump=0;
		 int n =input.length;
		 
		 if(input[0]==1 || input[n-1]==1) {
			   System.out.println("Jump not possible due to thunderstorm");
		 }
		 int i =0;
		 while(i<n-1) {
			   if(i+2<n && input[i+2]==0) {
				    i+=2;
			   }
			   else if(i+1<n && input[i+1]==0) {
				    i+=1;
			   }
			   else {
				   System.out.println("Invalid input");
				    return  ;
			   }
			   jump++;
		 }
		System.out.println(jump);
	}

}
