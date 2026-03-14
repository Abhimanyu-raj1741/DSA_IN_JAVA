package x01_CoderPadCommonQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PracticeBeast { 

	
	public static void main(String[] args) {
		  String str = "aabbbbccddddee";
		  
		  StringBuilder sb = new StringBuilder();
		  
		  char[] c =str.toCharArray();
		  int i =1;
		  int count =1 ;
		  char temp=c[0];
		   while(i<c.length) {
			   
			     if(temp ==c[i]) {
			    	  i++;
			    	  count++;
			     }
			     else {
			    	   sb.append(temp);
			    	   sb.append(count);
			    	   i++;
			    	   temp=c[i];
			    	   count =1;
			    	   
			     }
			     if(i==c.length) {
			    	     sb.append(temp);
			    	     sb.append(count);
			     }
		   }
		  System.out.println(sb.toString());
	}
	


}