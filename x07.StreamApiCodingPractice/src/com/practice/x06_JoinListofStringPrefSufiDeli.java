package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class x06_JoinListofStringPrefSufiDeli {
	
	public static void main(String[] args) {
		List<String> ls  =  Arrays.asList("java","C#","java","Python","C#");
		
		
		 String collect = ls.stream().collect(Collectors.joining(",","[","]"));
		 
		 System.out.println(collect);
	}
}
