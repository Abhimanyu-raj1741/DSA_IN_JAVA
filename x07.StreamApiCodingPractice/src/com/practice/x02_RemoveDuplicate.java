package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class x02_RemoveDuplicate {
    public static void main(String[] args) {
		 
    	 List<Integer> ls = Arrays.asList(1,1,3,5,5,0,0,2,7,8);
    	 
    	 
    	 List<Integer> collect = ls.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
    	 
    	 for(Integer i : collect) {
    		 System.out.println(i);
    	 }
	}
}
