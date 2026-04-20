package x01_MultThreadingBasics;

public class x04_ThreadImplRunnable implements Runnable {
	
	  public void run() {
		   System.out.println("Hello");
	   }
	  public static void main(String[] args) {
		 x04_ThreadImplRunnable t1 = new x04_ThreadImplRunnable();
		 
		 Thread t2 = new Thread(t1);
		 
		 Thread t3 = new Thread(new x04_ThreadImplRunnable());
		 
		 t2.start();
		 t3.start();
		 
		  
	}

}
