package x20_JavaStreamsConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class x01_CreationStreams {
	
	public static void main(String[] args) {
		   
	   // Creation Streams 
		// 1. From Collection
		 List<Integer> ls = Arrays.asList(1,2,3,4,5);
		 
		 Stream<Integer> stream = ls.stream();
		 
		 // 2. From Arrays 
		    int[] arr = {2,4,7,8,9};
		IntStream stream2 = Arrays.stream(arr);
		
		// 3.Using Stream of 
		   
		   Stream<Character> of = Stream.of('a','b','c');
		// 4. Infinite Stream 
		   Stream<Integer> limit = Stream.generate(()->10000000).limit(10);
		   limit.forEach(x->System.out.println(x));
		   Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
		 
		 
	}

}
