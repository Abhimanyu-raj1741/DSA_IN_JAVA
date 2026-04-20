package x05_DeadLock;

public class DeadLockExample {

	   public static void main(String[] args) {
		 
		    A a = new A();
		    B b = new B();
		    
		    Thread1 t1 = new Thread1(a,b);
		    Thread2 t2 = new Thread2(a,b);
		    t1.setName("T1");
		    t2.setName("T2");
		    t1.start();
		    t2.start();
	}
} 
