package com.practice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class x03_FrequencyofEachChar {
	
	public static void main(String[] args) {
		  
		 String str1 = "AbhimanyKumar";
		 
		 String str = str1.toLowerCase();
		 Map<Character, Long> collect = str.chars().mapToObj(c->((char)c)).collect(Collectors.groupingBy(Function.identity()
				 ,Collectors.counting()));
		 
		 for(Map.Entry<Character,Long> entry : collect.entrySet()) {
			  
			    System.out.println(entry.getKey()+ "-> "+ entry.getValue() );
		 }
	}

}
