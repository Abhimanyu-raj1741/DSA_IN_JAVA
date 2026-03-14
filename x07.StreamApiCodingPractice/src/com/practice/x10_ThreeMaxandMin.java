package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class x10_ThreeMaxandMin {

	public static void main(String[] args) {
		 
		List<Integer> ls = Arrays.asList(12,3,100,2,1,0,14,33);
		
		List<Integer> collect = ls.stream().sorted().limit(3).collect(Collectors.toList());
		
		for(Integer i : collect) {
			System.out.println(i);
		}
		
		ls.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}
