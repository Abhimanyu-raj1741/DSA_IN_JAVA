package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Abhimanyu",25,40000);
		Employee e2 = new Employee(2,"Rohan",21,33000);
		Employee e3 = new Employee(3,"Aniket ",35,110000);
		Employee e4 = new Employee(4,"Shicam",43,80000);
		Employee e5 = new Employee(5,"Jenet",66,90000);
		
		List<Employee> ls = Arrays.asList(e1,e2,e3,e4,e5);
		
		Collections.sort(ls,(a1,a2)->a1.getName().compareTo(a2.getName()));
		
		System.out.println(ls);
		
		List<Employee> ls1 =  Arrays.asList(e1,e2,e3,e4,e5);
		
		Collections.sort(ls1,new nameSort());
		
		System.out.println(ls1);
	}
}
