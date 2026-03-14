package x01_CoderPadCommonQuestion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class x02_MaxIPAddress {
	
	public static void main(String[] args) {
		 
		String[] str = {"10.45.05 -ab/bvc","10.45.05 -as/asd","21.12.11. - aa/rr/as",
				"10.15.05 -ab/bvc","10.15.05 -as/asd","10.15.05 - aa/rr/as"};
		
		HashMap<String,Integer> hp = new HashMap<>();
		
		for(String s :str) {
			String temp = s.substring(0,s.indexOf('-'));
			hp.put(temp,hp.getOrDefault(temp,0)+1 );
		}
		int m = Collections.max(hp.values());
		for(Map.Entry<String,Integer> v:hp.entrySet()) {
			if(m==v.getValue()) {
				System.out.println(v.getKey());
				
			}
				
		}
		 
	}

}
