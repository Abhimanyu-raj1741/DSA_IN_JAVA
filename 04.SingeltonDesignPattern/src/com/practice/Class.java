package com.practice;

public class Class {

	// Eager Way of initalization
	private static Class classs = new Class();
	
	
	public static Class getObj() {
		return classs;
	}
	
}
