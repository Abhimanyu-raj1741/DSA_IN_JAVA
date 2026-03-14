package x01_CoderPadCommonQuestion;

public class x14_RunLenghtEncoding {
	
	   public static void main(String[] args) {
		  
		    String str = "aabbbbccddddee";
		    
		    StringBuilder sb = new StringBuilder();
		    
		    char[] c = str.toCharArray();
		    int count =1;
		    char temp = c[0];
		    int i =1;
		    while(i<c.length) {
		    	    
		    	   if(c[i]==temp) {
		    		    i++;
		    		    count++;
		    	   }else {
		    		    sb.append(temp);
		    		    sb.append(count);
		    		    i++;
		    		    temp =c[i];
		    		    count=1;
		    	   }
		    	   if(i==c.length) {
		    		   sb.append(temp);
		    		   sb.append(count);
		    	   }
		    	   
		    }
		    System.out.println(sb.toString());
	}

}
