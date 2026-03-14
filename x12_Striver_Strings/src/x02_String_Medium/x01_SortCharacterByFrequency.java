package x02_String_Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class x01_SortCharacterByFrequency {
	public static void main(String[] args) {
//		Input: s = "tree"
//				Output: "eert"
//					
//		Input: s = "cccaaa"
//	    Output: "aaaccc"
		
		String s = "tree";
		HashMap<Character,Integer> hp = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(Character c :s.toCharArray()) {
			hp.put(c, hp.getOrDefault(c, 0)+1);
		}
		List<Character> ls = new ArrayList<>(hp.keySet());
		
		ls.sort((ob1,ob2)->hp.get(ob2)-hp.get(ob1));
		
		for(Character c : ls) {
			for(int i =0;i<hp.get(c);i++) {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
		
	}

}
