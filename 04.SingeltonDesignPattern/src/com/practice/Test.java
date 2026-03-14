package com.practice;

public class Test {
     
	
	public static void main(String[] args) {
		
		Employee e1 = Employee.getObject();
		System.out.println(e1.hashCode());
		
		Employee e2 = Employee.getObject();
		System.out.println(e2.hashCode());
		
		System.out.println(Class.getObj().hashCode());
		System.out.println(Class.getObj().hashCode());
		
		
	}
}
