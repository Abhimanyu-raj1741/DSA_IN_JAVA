package x08_StreamApiEmplyee;

import java.util.HashMap;
import java.util.Map;

public class Delloite {
	
	public static int recursive(int x) {
		
		      if(x<=1)    
		    	  return x;
		 
		      else 
		    	  return recursive(x-1)+recursive(x-2);
		      
		
	}
// Deloitte	 Emplyeeid employeename salary  department id | department id deparment name 
	 
//	 select 
	
	public static void main(String[] args) {
		
		String str = "Abhimanyu Kumar ";
		 
	
		
		HashMap<Character,Integer> hp = new HashMap<>();
		
		for(Character c : str.toCharArray()) {
			hp.put(c, hp.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: hp.entrySet()) {
			
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
		
	    int x =5 ;
	    
	    for(int i =0; i<8;i++) 
	     System.out.println(recursive(i));
		
	}

}
