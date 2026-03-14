package com.practice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class x04_FrequencyOfElement {
         public static void main(String[] args) {
			  
        	List<String> ls  =  Arrays.asList("java","C#","java","Python","C#");
        	
        	Map<String, Long> collect = ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        	
        	for(Map.Entry<String, Long> entry :collect.entrySet()) {
        		
        		System.out.println(entry.getKey()+ "  "+entry.getValue());
        	}
        	
		}
}
