package com.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class x09_MergeTwoSortedArray {

	public static void main(String[] args) {
		 
		int[] arr = {2,15,3,91};
		int[] arr1 = {12,4,15,24};
		
		
		int[] array = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1)).sorted().toArray();
		
		for(Integer i : array) {
			 System.out.print(i+" ");
		}
	}
}
