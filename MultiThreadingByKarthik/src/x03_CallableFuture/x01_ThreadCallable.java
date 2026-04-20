package x03_CallableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class x01_ThreadCallable  implements Callable{ 
          
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	 // Callable return objects which comes in future 
	// so we are using future interface 
	Future<Object>[] future = new Future[10];
	
	 public static void main(String[] args) {
		 
		 x01_ThreadCallable t1 = new x01_ThreadCallable();
		 
		 ExecutorService ex = Executors.newFixedThreadPool(3);
		 
		 Future<Object> f =  ex.submit(t1);
		 // future[0]=f;
	}

}
