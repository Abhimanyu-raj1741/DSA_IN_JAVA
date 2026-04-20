package x01_CoderPadCommonQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class x07_GroupAnagram {
	
	public static void main(String[] args) {
		 
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String,List<String>> hp = new HashMap<>();
		
		for(int i=0;i<str.length;i++) {
			String temp = str[i];

            char[] ch = temp.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!hp.containsKey(key)) {
                hp.put(key, new ArrayList<>());
            }

            hp.get(key).add(temp);
		}
		Collection<List<String>> values = hp.values();
		
		System.out.println(hp.values());
	}

}
