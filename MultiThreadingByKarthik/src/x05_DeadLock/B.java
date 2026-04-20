package x05_DeadLock;

public class B {
	
	public void m2(A a,B b) {
		
		System.out.println(Thread.currentThread().getName()+ " Executing");
		
		synchronized(b){
		  System.out.println(Thread.currentThread().getName()+ " has acquired lock on b");
		  System.out.println(Thread.currentThread().getName()+ " is trying to acquired lock on a");
		  synchronized(a){
			  System.out.println(Thread.currentThread().getName()+ " has acquired lock on a");
			  
			}
		}
		
	}

}
