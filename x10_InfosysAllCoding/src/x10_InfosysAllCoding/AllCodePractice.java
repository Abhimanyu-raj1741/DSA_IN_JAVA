package x10_InfosysAllCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllCodePractice {
	
	public static void main(String[] args) {
		
		// Filter the number which start with 1
		List<Integer> ls = Arrays.asList(10,23,101,504,11,1);
		
		ls.stream().map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::valueOf).forEach(System.out::println);
		
		// Frequency Count
		
		List<Integer> arr = Arrays.asList(1,2,2,1,3,4,5,6,6);
		
		HashMap<Integer,Integer> hp= new HashMap<>();
		
		for(Integer i : arr) {
			hp.put(i, hp.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : hp.entrySet()) {
			
			if(entry.getValue()==2)
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// move 0 to right side of array 
		
		int[] arr1 = {1,1,0,0,1,1,0};
		
		
		int[] ans = IntStream.concat(Arrays.stream(arr1).filter(c->c!=0), Arrays.stream(arr1).filter(c->c==0)).toArray();
		
		System.out.println(Arrays.toString(ans));
		
		// Duplicate using set 
		
		String str = "abcdefgaabc";
		
		Set<Character> st = new HashSet<>();
		
		Set<Character> a = str.chars().mapToObj(c->(char)c).filter( e -> !st.add(e)).collect(Collectors.toSet());
		
		System.out.println(a);
		
		// using linked Hashmap 
		// Non Repeating character 
		
		String stri = "geeksforgeeks";
		
	 Character s =	stri.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting()))
		         .entrySet()
		         .stream()
		         .filter(e->e.getValue()==1)
		         .map(Map.Entry::getKey)
		         .findFirst()
		         .orElse(null);
		       
		System.out.println(s);
		
		Character s1 = stri.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting()))
		         .entrySet()
		         .stream()
		         .filter(e->e.getValue()>1)
		         .map(Map.Entry::getKey)
		         .findFirst()
		         .orElse(null);
		
		   System.out.println(s1);
		
	}

}
