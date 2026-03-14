package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class x08_FindMaxandMin {
       
	public static void main(String[] args) {
		  
		List<Integer> ls = Arrays.asList(5,3,15,40,12,20);
		
		// To Get the Max Element 
		Integer integer = ls.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println(integer);
		
		// To Get the Min Element 
		Integer integer2 = ls.stream().min(Comparator.naturalOrder()).get();
		System.out.println(integer2);
	}
}
