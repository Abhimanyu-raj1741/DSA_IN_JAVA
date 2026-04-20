package x05_DeadLock;

public class Thread2 extends Thread  {
	
	A a =null;
	B b = null;
	public Thread2(A a ,B b) {
		this.a=a;
		this.b=b;
		// TODO Auto-generated constructor stub
	}
	
	
	 public void run() {
		 b.m2(a,b);
	 }

}
