package com.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class x11_AnagramProgram {

	public static void main(String[] args) {
		
		String str ="Sonu";
		String str1 ="onuS";
		
		String s1= Stream.of(str.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		String s2 =Stream.of(str1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			 System.out.println("Valid Anagram ");
		}
		else {
			System.out.println("Not Anagram ");
		}
				
	}
}
