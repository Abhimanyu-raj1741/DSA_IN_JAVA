package x01_MultThreadingBasics;

public class x07_SalaryCalcualtion implements Runnable {
	
	
	Employee e = null;
	
	public x07_SalaryCalcualtion(Employee e) {
		// TODO Auto-generated constructor stub
		this.e=e;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stubs
		salaryCalculation(e);
		
	} 
	
	public void salaryCalculation(Employee e) {
		 double salary = e.getBasicSalaryPerDay()*21;
	}
	
	 

}
