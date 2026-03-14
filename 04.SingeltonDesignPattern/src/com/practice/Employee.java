package com.practice;

public class Employee {
      
	// LAZY way of initilaziation
	private static Employee employee;
	
	private Employee() {
		if(employee !=null) {
			throw new  RuntimeException("You are breaking singelton rule");
		}
	}
	
	public static Employee getObject() {
		
		synchronized(Employee.class) {
			if(employee==null) {
				employee =new Employee();
			}
		}
		
		return employee;
	}
	
	
	
}
