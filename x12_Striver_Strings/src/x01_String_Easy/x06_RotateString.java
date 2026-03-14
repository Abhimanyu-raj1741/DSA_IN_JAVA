package x01_String_Easy;

public class x06_RotateString {
    public static void main(String[] args) {
//    	Example 1:
//
//    		Input: s = "abcde", goal = "cdeab"
//    		Output: true
//    		Example 2:
//    		Input: s = "abcde", goal = "abced"
//    		Output: false
    	         
    	        boolean result = false; 
    	        String s = "abcde";
    	        String goal = "cdeab";
    	        
    	        String concat = s+s;
    	        if(s.length()!=goal.length()) result=false;
    	        if(concat.contains(goal)) result =true;
    	        
    	        
    	        System.out.println(result);
    	       
	}
}
