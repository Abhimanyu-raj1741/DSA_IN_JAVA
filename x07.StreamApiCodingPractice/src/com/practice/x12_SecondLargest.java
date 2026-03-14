package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class x12_SecondLargest {
    
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(12,3,100,2,1,0,14,33);
		
		Integer integer = ls.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(integer);
		
		
		
	}
}
