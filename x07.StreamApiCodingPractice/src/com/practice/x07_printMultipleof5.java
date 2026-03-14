package com.practice;

import java.util.Arrays;
import java.util.List;

public class x07_printMultipleof5 {
     
	 public static void main(String[] args) {
		   
		 List<Integer> ls = Arrays.asList(5,3,15,40,12,20);
		 
		  ls.stream().filter(i -> i%5 ==0 ).forEach(System.out::println);
	}
}
