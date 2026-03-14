package com.practice;

public class DeveloperClient {
	
         public static void main(String[] args) {
			Employee obj = FactoryClass.getObj("Android Developer");
			
			System.out.println(obj.salary());
		}
             
}
