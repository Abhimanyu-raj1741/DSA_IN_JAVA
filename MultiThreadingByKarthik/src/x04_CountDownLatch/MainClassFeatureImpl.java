package x04_CountDownLatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class MainClassFeatureImpl {
	static CountDownLatch cl=null;
	public static int m1() {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(123, "Karthik", 1212, 21));
		list.add(new Employee(124, "Karthik1", 1212, 21));
		list.add(new Employee(125, "Karthik2", 1212, 21));
		list.add(new Employee(126, "Karthik3", 1212, 21));
		
		
		Map<String, Employee> m1= new HashMap<>();
		Executors.newFixedThreadPool(3);
		//Class implements runnable
		//
		for (int i = 0; i < list.size(); i++) {
			m1.put(list.get(i).getEmpName(),list.get(i));
		}
		
		Map<String, Employee> m= list.parallelStream().collect(Collectors.toMap(p->p.getEmpName(), p->p));
		//Map<String, Employee> m= list.parallelStream().forEachOrdered(p->System.out.println(p));
		System.out.println(m);
		System.out.println("m1 method");
		return 0;
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int i1=m1();
		Employee e= new Employee(123, "Karthik", 10000, 20);
		Employee e1= new Employee(124, "Puneet", 20000, 22);
		Employee e2= new Employee(125, "Nikanth", 30000, 18);
		Employee e3= new Employee(126, "Deepak", 50000, 20);
		Employee e4= new Employee(127, "Ajay", 1000, 19);
		Employee e5= new Employee(128, "Ansari", 10000, 25);
		Employee e6= new Employee(129, "Raghav", 10000, 20);
		Employee e7= new Employee(130, "Rajiv", 10000, 20);
		Employee e8= new Employee(131, "Rathan", 10000, 20);
		Employee e9= new Employee(132, "Bhaskar", 10000, 20);
		
		Employee[] empArray=new Employee[10];
		empArray[0]=e;//-->1
		empArray[1]=e1;//1
		empArray[2]=e2;
		empArray[3]=e3;
		empArray[4]=e4;
		empArray[5]=e5;
		empArray[6]=e6;
		empArray[7]=e7;
		empArray[8]=e8;
		empArray[9]=e9;
		cl=new CountDownLatch(empArray.length);
		ExecutorService ex= Executors.newFixedThreadPool(3);
		List<Future<Employee>> futureList=new ArrayList<>();
		for (int i = 0; i < empArray.length; i++) {
			SalaryCalculation s=new SalaryCalculation(empArray[i],cl);
			Future<Employee> f=ex.submit(s);
			futureList.add(f);
		}
		//Salary calculation
		//Count down latch
		//Create the file
		//t.join();
		
		
		
		
		cl.await();
		for (int i = 0; i < futureList.size(); i++) {
			if(futureList.get(i).isDone()) {
				 Employee r1= futureList.get(i).get();
				 if(r1!=null) {
					 
				 }
			}
			System.out.println(futureList.get(i));
			
		}
		ex.shutdown();
		
		//T1->T2->T3
		/*
		 * t1.start(); t1.join(); t2.start(); t2.join(); t3.start(); t3.join();
		 */

}
}
