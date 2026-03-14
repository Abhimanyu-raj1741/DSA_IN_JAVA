package x01_CoderPadCommonQuestion;

public class x17_LongestSubStringWithoutRepating {
	
	public static void main(String[] args) {
		 String s ="abcccdefg";
		 String response="",current="";
		 for(Character c : s.toCharArray()) {
			 String pc = String.valueOf(c);
			 if(current.contains(pc)) {
				  current = current.substring(current.indexOf(pc)+1);
			 }
			 current+=pc;
			if(current.length()>response.length()) {
				response=current;
			}
			 
		 }
		 System.out.println(response);
	}

}
