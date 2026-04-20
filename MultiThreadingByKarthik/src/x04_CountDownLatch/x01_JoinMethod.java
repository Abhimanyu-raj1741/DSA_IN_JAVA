package x04_CountDownLatch;

public class x01_JoinMethod {
	
	public static void main(String[] args) throws InterruptedException {
		  
		   Thread t1 = new Thread(new Runnable(){
			     @Override
			    public void run() {
			    	// TODO Auto-generated method stub
			    	System.out.println("T1 thread porcessing salary");
			    }
		   });
		   Thread t2 = new Thread(new Runnable(){
			     @Override
			    public void run() {
			    	// TODO Auto-generated method stub
			    	System.out.println("T2 thread porcessing salary");
			    }
		   });
		   Thread t3 = new Thread(new Runnable(){
			     @Override
			    public void run() {
			    	// TODO Auto-generated method stub
			    	System.out.println("T3 thread porcessing file preparation");
			    }
		   });
		   
		   t1.start();
		   t2.start();
		   t1.join();
		   t2.join();
		   t3.start();
	}

}
