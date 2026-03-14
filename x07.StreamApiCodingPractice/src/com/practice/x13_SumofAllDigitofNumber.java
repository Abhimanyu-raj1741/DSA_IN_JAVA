package com.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class x13_SumofAllDigitofNumber {

	public static void main(String[] args) {
		 
		  Integer s= 3424;
		  
		  Integer collect = Stream.of(String.valueOf(123413).split("")).collect(Collectors.summingInt(Integer::parseInt));
		  
		  System.out.println(collect);
		  
		   
		 
	}
}
