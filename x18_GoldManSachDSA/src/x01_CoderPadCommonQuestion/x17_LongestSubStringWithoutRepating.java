package x01_CoderPadCommonQuestion;

public class x17_LongestSubStringWithoutRepating {
	
	public static void main(String[] args) {
		 String s ="abcccdefgijkllmnop";
		 
		 findWithIndex(s);
//		 String response="",current="";
//		 int start = 0;
//		 int end =0;
//		 int tempstart =0;
//		 int index=0;
//		 for(Character c : s.toCharArray()) {
//			 
//			 String pc = String.valueOf(c);
//			 if(current.contains(pc)) {
//				 int idx = current.indexOf(pc);
//				  current = current.substring(idx+1);
//				  tempstart = tempstart+idx+1;
//			 }
//			 current+=pc;
//			if(current.length()>response.length()) {
//				response=current;
//				start = tempstart;
//				end = index;
//			
//			}
//			 index++;
//		 }
//		 System.out.println(response);
	}
	
	public static void findWithIndex(String s) {
		  

		    String response = "", current = "";
		    int start = 0;
		    int end = 0;
		    int tempStart = 0;
		   // String s ="abcccdefgijkllmnop";
		    for (int i = 0; i < s.length(); i++) {

		        char c = s.charAt(i);
		        String pc = String.valueOf(c);

		        if (current.contains(pc)) {

		            int idx = current.indexOf(pc);
		            current = current.substring(idx + 1);
                    
		            tempStart = tempStart + idx + 1;
		        }

		        current += pc;
                //System.out.println(current);
		        if (current.length() > response.length()) {
		            response = current;
		            start = tempStart;
		            end = i;
		        }
		    }

		    System.out.println(response);
		    System.out.println(start + " " + end);
	}

}
