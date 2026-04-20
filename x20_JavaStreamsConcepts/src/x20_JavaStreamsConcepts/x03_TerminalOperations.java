package x20_JavaStreamsConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class x03_TerminalOperations {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		// collect 
		List<Integer> collect = ls.stream().skip(1).collect(Collectors.toList());
		System.out.println(collect);


		// forEach
		ls.stream().forEach(x->System.out.println(x));

		System.out.println("-------------------");
		// Reduce
		Optional<Integer> reduce = ls.stream().reduce((x,y)->x+y);
		
		// toArray

		System.out.println(reduce.get());

		// count 
		System.out.println(ls.stream().count());    
		
		// min max 
		 
		// forEachOrders 
		List<Integer> ls3= Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("Using for Each with Parallel Stream");
		ls3.parallelStream().forEach(System.out::println);
		ls3.parallelStream().forEachOrdered(System.out::println);

		// AnyMatch , All Match , None Match 

		boolean anyMatch = ls.stream().anyMatch(x->x%2==0);
		System.out.println(anyMatch);
		boolean allMatch = ls.stream().allMatch(x->x%2!=0);
		System.out.println(allMatch);
		boolean noneMatch = ls.stream().noneMatch(x->x%2==0);
		System.out.println(noneMatch);
		
		// findFirst, findAny 
		System.out.println(ls.stream().findFirst().get());
		System.out.println(ls.stream().findAny().get());
		
        // Example 
		System.out.println("--------------------");
		String[] str1 = {"This "," is"," Abhimanyu"};
		
		Arrays.stream(str1).flatMapToInt(x->x.chars() ).mapToObj(e->(char)e).filter(t->t!=' ').map(Character::toUpperCase).forEach(System.out::print);
		Map<Character, Long> collect2 = Arrays.stream(str1).flatMapToInt(x->x.chars() ).mapToObj(e->(char)e).filter(t->t!=' ').map(Character::toUpperCase)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println();
		collect2.forEach((x,y)-> System.out.println(x + " " + y));
	}
}
