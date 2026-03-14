package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class x05_sortThelistinReverseOrder {

	public static void main(String[] args) {
		     
		List<Integer> ls = Arrays.asList(4,3,5,12,1,0,15);
		
		ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
}
