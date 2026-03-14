package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class x14_Practice {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(12,2,3,4,6,11,13,1);

		Map<Boolean, List<Integer>> collect = ls.stream().collect(Collectors.partitioningBy(i->i%2==0));


		for(Map.Entry<Boolean, List<Integer>>  entry : collect.entrySet()) {

			if(entry.equals(0)) {
				System.out.println(" Odd Numbers ");
				System.out.println( " " + entry.getValue());

			}
			else {
				System.out.println(" Even Numbers ");
				System.out.println(" " + entry.getValue());
			}
		}
		System.out.println("-----------------------");
		List<Integer> rs = Arrays.asList(2,2,3,4,6,11,3,1);
		rs.stream().distinct().forEach(System.out::println);


		String str = "Abhimanyu Kumar";
		String str1 = str.toLowerCase();

		Map<Character, Long> collect2 = str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		for(Map.Entry<Character, Long> entry1  : collect2.entrySet()) {

			System.out.println(entry1.getKey() + "  " + entry1.getValue());

		}

		List<Integer> rr = rs.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());

		System.out.println("-------------------------");

		for(Integer i : rr) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		Integer a =   rr.stream().max(Comparator.naturalOrder()).get();         	 
		System.out.println(a);
		Integer b = rr.stream().min(Comparator.naturalOrder()).get();
		System.out.println(b);
		System.out.println("-------------------------");
		Integer secondHighest = rr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         System.out.println(secondHighest);
         
         int[] arr = { 2,1,11,4};
         int[] arr1 = {3,4,5,6};
         
         int[] ans = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1)).sorted().toArray();
         System.out.println(Arrays.toString(ans));
         
         List<String> str2 = Arrays.asList("Abhi","Monu","Sonu","Max");
         
         int sum = str2.stream().mapToInt(String::length).sum();
         System.out.println(sum);
         str2.stream().map(s->s.charAt(0)).forEach(System.out::println);
         
         List<String> str3 = Arrays.asList("java developer","python developer","java backend","react developer","program analyst");
         
         System.out.println("-------------------------");
         str3.stream().filter(s->s!=null && s.startsWith("java")).forEach(System.out::println);
        
        //  First non Repeating Character 
         
         String s = "programing";
         
          Character result =    s.chars()
               .mapToObj(c->(char)c)
               .collect(Collectors.groupingBy(
            		   c ->c,
            		   LinkedHashMap::new,
            		   Collectors.counting()))
            		   .entrySet()
            		   .stream()
            		   .filter(e->e.getValue() == 1 )
            		   .map(Map.Entry::getKey)
            		   .findFirst()
            		   .orElse(null);
               
                System.out.println(result);
                
       // First Repeating Character          
                String q = "geeksforgeeks";
                Character an = q.chars()
                		             .mapToObj(c->(char)c)
                		             .collect(Collectors.groupingBy(c->c,
                		            		 LinkedHashMap::new,
                		            		 Collectors.counting()))
                                  .entrySet()
                                  .stream()
                                  .filter(e->e.getValue()>1)
                                  .map(Map.Entry::getKey)
                                  .findFirst()
                                  .orElse(null);
                System.out.println(an);
                
       // Duplicate Integers 
                List<Integer> list = Arrays.asList(1,2,2,3,1,4,6);
                 
                Set<Integer> st = new HashSet<>();
               
               Set<Integer> re =   list.stream().filter(e-> !st.add(e)).collect(Collectors.toSet());
               
               System.out.println(re);
       
      // Duplicate Characters          
                String qq = "aabbcde";
                Set<Character> se = new HashSet<>();
                Set<Character> collect3 = qq.chars().mapToObj(c->(char)c).filter(e-> !se.add(e)).collect(Collectors.toSet());
                
                System.out.println(collect3);
                
    // Filter number which starts with 1 
                List<Integer> ls1 = Arrays.asList(10,23,101,504,156,569,1110);
                ls1.stream().map(String::valueOf).filter(e->e.startsWith("1")).map(Integer::valueOf).forEach(System.out::println);
                
    // Move 0 to the end of arr
                int[] arr2 = {1,0,0,1,0};
                
              int[] ans1 =  IntStream.concat(Arrays.stream(arr1).filter(e->e!=0),Arrays.stream(arr2).filter(e->e==0)).toArray();
              
              System.out.println(Arrays.toString(ans1));
              
   //  first Repeating character  
             String x = "geeksforgeeks";
        Character so =     x.chars()
             .mapToObj(c->(char)c)
             .collect(Collectors.groupingBy(c->c
            		 ,LinkedHashMap::new 
            		 ,Collectors.counting()))
             .entrySet()
             .stream()
             .filter(e->e.getValue()>1)
             .map(Map.Entry::getKey)
             .findFirst()
             .orElse(null);
                
        System.out.println(so);
        
    //  Date time     
        LocalDateTime date = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        System.out.println(date);
        
	}
}

