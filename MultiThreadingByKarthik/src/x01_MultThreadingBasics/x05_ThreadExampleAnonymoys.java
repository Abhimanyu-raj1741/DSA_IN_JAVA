package x01_MultThreadingBasics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class x05_ThreadExampleAnonymoys {
	
	public static void main(String[] args) {
		   
		 Thread t = new Thread(new Runnable() {
			 @Override
			public void run() {
				// TODO Auto-generated method stub
				 System.out.println("Hello");
				
			}
		 });
		 t.start();
		 
		 // Drawbacks of Threads 
		  /* 
		   * we cannot reuse thread
		   * Thread Pool
		   *  Single TheadPool
		   *  Cached ThreadPool 
		   *  Scheduled Thread pool 
		   *  Fixed Thread pool 
		   * 
		   */
		 ExecutorService ex =Executors.newFixedThreadPool(3);
		 ExecutorService ex1 = Executors.newCachedThreadPool();
		 ExecutorService ex2 = Executors.newScheduledThreadPool(4);
		 
		 
		 
		 
		 
	}

}
