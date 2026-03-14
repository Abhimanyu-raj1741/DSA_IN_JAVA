package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8PracticeforAccenture {
	
	public static void main(String[] args) {
		 
		// 1) Given a list of integers, separate odd and even numbers?
		     
		List<Integer> ls = Arrays.asList(1,2,5, 12, 14 ,18 ,11, 13);
		
		Map<Boolean,List<Integer>> ans =   ls.stream().collect(Collectors.partitioningBy(i->i%2==0));
		 
	

		for(Map.Entry<Boolean,List<Integer>> mp : ans.entrySet()) {
			if(mp.getKey()) {
				System.out.println("Even Numbers");
				for(Integer i : mp.getValue()) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("Odd  Numbers");
				for(Integer i : mp.getValue()) {
					System.out.println(i);
				}
			}
		}
		System.out.println("----------remove duplicate elements from a list------------");
		// remove duplicate elements from a list using Java 8 streams
		 
		 List<Integer> ls1 = Arrays.asList(3,3,11,11,2,5,5,4);
		 
		 ls1.stream().distinct().sorted().forEach(System.out::println);
		 
		 
		 System.out.println("-------frequency of each character--------");
		 
		 // find frequency of each character in a string using Java 8 
		   String str = "Abhimanyu Kumar" ;
		    Map<Character,Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		    
		    for(Map.Entry<Character,Long>  mp : collect.entrySet()) {
		    	   
		    	    System.out.println(mp.getKey() + " " + mp.getValue());
		    }
		 // find frequency of each element in an array or a list
		    System.out.println("-------find frequency of each element in an array or a list--------");
		    
		    List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		    
		    Map<String ,Long> ans1= stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		    
		    for(Map.Entry<String, Long> hp : ans1.entrySet()) {
		    	    
		    	     System.out.println(hp.getKey() + " " + hp.getValue());
		    	 
		    }
		    System.out.println("---------Sort The Decimal Number in reverse order---------");
		    
		    
		   // Sort The Decimal Number in reverse order
		    List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		    
		    decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		    
		   //  joining words 
		    
		    List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		    
		   String str1 =   listOfStrings.stream().collect(Collectors.joining(",","[","]"));
		   
		   System.out.println( str1);
		    
		   // Max Min 
		   List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		    int max =  listOfIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		   System.out.println(max);
		   int min=  listOfIntegers.stream().sorted().findFirst().get();
		   System.out.println(min);
		   
		   // Merge two unsorted array into single sorted array
		   int[] a = new int[] {4, 2, 5, 1};
	         
	       int[] b = new int[] {8, 1, 9, 5};
	       
	       int[] c =  IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	       
	       System.out.println(Arrays.toString(c));
	       
	       // 3 Max and 3 Min 
	       List<Integer> listOfInt= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	       System.out.println("------3 Min-----------");
	       listOfInt.stream().sorted().limit(3).forEach(System.out::println);
	       System.out.println("------3 Max-----------");
	       listOfInt.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	       
	       // Java 8 program to check if two strings are anagrams or not 
	       
	        String s1 = "RaceCar";
	        String s2 = "CarRace";
	       
	       s1= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	       s2= Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	       
	       if(s1.equals(s2)) {
	    	   System.out.println("This is anagram");
	       }
	       else {
	    	   System.out.println("This is not anagram");
	       }
	       System.out.println("Sum of digit of Integer");
	       // find the sum of digit of Integer 
	       int i = 23756;
	       
	       int sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
	       System.out.println(sum);
	       
	        // Given an integer array, find sum and average of all elements?
	       
	       int[] a1 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
	        
	       System.out.println("sum of arrays");
	       
	       int sum1 = Arrays.stream(a1).sum();
	       System.out.println(sum1);
	       Double average = Arrays.stream(a1).average().getAsDouble();
	       System.out.println(average);
	       
	       // Reverse the String of sentence 
	       String string1 = "java Concept of the Day";
	       
	       String reverseWords = Arrays.stream(string1.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	       
	       System.out.println(reverseWords);
	       
	       // find sum of first 10 natural numbers?
	        int sum2 = IntStream.rangeClosed(1,10).sum();
	        System.out.println("---------RangeSum---------------");
	        System.out.println(sum2);
	        
	        //  Reverse an integer array
	        int[] array = new int[] {5, 1, 7, 3, 9, 6};
	        
	        int[] reversedArray = IntStream.rangeClosed(1,array.length).map(j -> array[array.length-j]).toArray();
	        
	        System.out.println(Arrays.toString(reversedArray));
	        System.out.println("--------------------------");
	        
	        List<Integer> myList = Arrays.asList(10,23,101,504,156,569,211,1001);
	        
	        myList.stream().map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::valueOf).forEach(System.out::println);
	        
	        
	}

}
