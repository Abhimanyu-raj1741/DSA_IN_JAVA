package x05_DeadLock;

public class Thread1 extends Thread {
	
	A a =null;
	B b = null;
	public Thread1(A a ,B b) {
		this.a=a;
		this.b=b;
		// TODO Auto-generated constructor stub
	}
	
	
	public void run() {
		a.m1(a,b);
	}

}
