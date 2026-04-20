package x01_MultThreadingBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class x06_ThreadEmployeeThreadPool {
	
	public static void main(String[] args) {
		Employee e = new Employee(123,"Abhimanyu", 1000);
		Employee e1 = new Employee(124,"Anuj", 1200);
		Employee e2 = new Employee(125,"Mantu", 1100);
		Employee e3 = new Employee(126,"Ashish", 500);
		Employee e4 = new Employee(127,"Ramesh", 900);
		Employee e5 = new Employee(128,"Asha", 1200);
		Employee e6 = new Employee(129,"sina", 1150);
		Employee e7 = new Employee(130,"swati", 1100);
		Employee e8 = new Employee(131,"varsha", 800);
		
		List<Employee > empList = new ArrayList<>();
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		
		//ExecutorService ex = Executors.newFixedThreadPool(3);
		//ExecutorService ex1 = Executors.newCachedThreadPool();
		ScheduledExecutorService ex2 = Executors.newScheduledThreadPool(4);
		for(int i=0;i<empList.size();i++) {
			x07_SalaryCalcualtion s = new x07_SalaryCalcualtion(empList.get(i));
			ex2.schedule(s,60,TimeUnit.SECONDS);
			
		}
		
	}

}
