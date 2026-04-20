package x01_MultThreadingBasics;

public class x01_ThreadExample extends Thread {
    
	 public void run() {
		  System.out.println("Inside Run Method");
	 }
	 
	 public static void main(String[] args) {
		        
		  x01_ThreadExample t1 = new x01_ThreadExample();
		  t1.start();
		  x01_ThreadExample t2 = new x01_ThreadExample();
		  t2.start();
		  x01_ThreadExample t3 = new x01_ThreadExample();
		  t3.start();
		  System.out.println("Hi");
	}
}
