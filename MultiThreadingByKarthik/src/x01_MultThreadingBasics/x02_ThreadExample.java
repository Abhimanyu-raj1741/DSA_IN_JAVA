package x01_MultThreadingBasics;

public class x02_ThreadExample extends Thread{
	
	int startEmpNumber;
	int endEmpNumber;
	
	x02_ThreadExample(int startEmpNumber,int endEmpNumber){
		 this.startEmpNumber=startEmpNumber;
		 this.endEmpNumber=endEmpNumber;
	}
	static public void calculateSalary(Employee e) {
		 // 10000 perday 
		//  25 days => 25*10000
		// salary = basicsalary*no of working days 
		// Entire logic of calculating salary 
		// 5000 Lines
		
	}
	
	public void run() {
		  System.out.println("Inside Run method");
		  for(int i=startEmpNumber;i<endEmpNumber;i++) {
			   calculateSalary(null);
		  }
		
	}
          
	public static void main(String[] args) {
		  x02_ThreadExample t1 = new x02_ThreadExample(1,50000);
		  t1.start();
		  x02_ThreadExample t2 = new x02_ThreadExample(50001,100000);
		  t2.start();
		  x02_ThreadExample t3 = new x02_ThreadExample(100000,200000);
		  t3.start();
	}
	
	
}
