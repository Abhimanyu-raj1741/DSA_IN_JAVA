package x20_JavaStreamsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;



public class x02_IntermediateOperations {
  public static void main(String[] args) {
	  
	  List<String> ls = Arrays.asList("Akash","Ram","Shyam","Ghanshyam","Abhimanyu","Akash");
	  
	  // Filter
	  ls.stream().filter(x->x.startsWith("A")).forEach(System.out::println);;
	  System.out.println("--------------------");
	  
	  // Map
	   ls.stream().map(String::toUpperCase).forEach(System.out::println);
	   System.out.println("--------------------");
	   
	  // Sorted
	   ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	   System.out.println("--------------------");
	   ls.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
	   
	   System.out.println("---------------------");
	   // distinct 
	   ls.stream().sorted().distinct().forEach(System.out::println);
	   
	   // limit 
	     System.out.println(Stream.iterate(1, x->x+1).limit(10).count());
	     
	   // Skip   
	     System.out.println(Stream.iterate(1, x->x+1).skip(2).limit(10).count());
	     
	   // flat map 
	     List<List<String>> namesList = new ArrayList<>();

	        namesList.add(Arrays.asList("Abhimanyu", "Rahul", "Amit"));
	        namesList.add(Arrays.asList("Priya", "Sneha", "Neha"));
	        namesList.add(Arrays.asList("John", "David", "Alex"));
	        
	        namesList.stream().flatMap(x->x.stream()).forEach(System.out::println);
	        
	    List<String> ls1 = Arrays.asList(
	    		"This is",
	    		"Java 8 Code",
	    		"Practice done");   
	    List<String> list = ls1.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).map(String::toUpperCase)
	    .toList();
	    System.out.println(list);
}      
}
