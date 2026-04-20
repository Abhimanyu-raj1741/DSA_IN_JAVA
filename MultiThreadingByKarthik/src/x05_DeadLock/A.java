package x05_DeadLock;

public class A {
	
	public void m1(A a, B b) {
		
		System.out.println(Thread.currentThread().getName()+ " Executing");
		
		synchronized(a){
		  System.out.println(Thread.currentThread().getName()+ " has acquired lock on a");
		  System.out.println(Thread.currentThread().getName()+ " is trying to acquired lock on b");
		  synchronized(b){
			  System.out.println(Thread.currentThread().getName()+ " has acquired lock on b");
			  
			}
		}
		
	}

}
