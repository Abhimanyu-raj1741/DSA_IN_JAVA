package x01_CoderPadCommonQuestion;

public class x18_FindIndexAndLengthOfMostRepeatingCharacter {
	
	
	public static void main(String[] args) {
		  String str = "aabbaccccccas";
		  
		  int count=1;
		  int maxLen =0;
		
		  int start=0;
		  
		  int current=0;
		   for(int i=1;i<str.length();i++) { 
			     
			   if(str.charAt(i)==str.charAt(i-1)) {
				   count++;
				 
			   }
			   else {
				    count =1;
				   current =i;
			   }
			     if(count>maxLen) {
			    	  maxLen =count ;
			    	  start =current; 
			    	  
			     }
		   }
		   System.out.println(start  + "  "+ maxLen);
	}

}
