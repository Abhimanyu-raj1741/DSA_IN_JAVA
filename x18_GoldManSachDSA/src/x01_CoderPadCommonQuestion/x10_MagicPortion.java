package x01_CoderPadCommonQuestion;

public class x10_MagicPortion {
              
	public static void main(String[] args) {
		 String str = "ababcababcd";
		 
		 String out ="";
		 out+= str.charAt(0);
		 int i =1;
		 int cnt =0;
		 
		 while(i<str.length()) {
			   
			  String left = str.substring(0,i);
			  if(left.length()>(str.length()/2)) {
				   out+=str.substring(i,str.length());
				   break;
			  }
			  
			  String right = str.substring(i,2*i);
			  
			  if(left.equals(right)) {
				   out+="*";
				   i= i+i;
				   cnt++;
			  }
			  else {
				   out+=str.charAt(i);
				   i++;
			  }
		 }
		 if(cnt>1) {
			  System.out.println(out.length()-cnt+1);
			  System.out.println(out);
		 }else {
			  System.out.println(out.length());
			 System.out.println(out);
		 }
		 
	}
}
