package com.practice;

public class FactoryClass {
  
	public static Employee getObj(String emp)
	{
		if(emp.trim().equalsIgnoreCase("Android Developer")){
			return  new AndroidDeveloper();
		}
		else if(emp.trim().equalsIgnoreCase("Java Developer")) {
			return new JavaDeveloper();
		}
		else 
			return null;
		
	}
}
