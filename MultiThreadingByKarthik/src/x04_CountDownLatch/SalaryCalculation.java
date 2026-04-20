package x04_CountDownLatch;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

import x04_CountDownLatch.*;

public class SalaryCalculation implements Callable<Employee>{
	Employee e=null;
	CountDownLatch cl=null;
	SalaryCalculation(Employee e,CountDownLatch cl){
		this.e=e;
		this.cl=cl;
	}
	
	public void salaryCalculation(Employee e) {
		double Salary=e.getNoOfWorkingDays()*e.getPerDayBasicSalary();
		System.out.println(Salary);
	}

	@Override
	public Employee call() {
		// TODO Auto-generated method stub
		LocalDateTime date1=LocalDateTime.now();
		salaryCalculation(e);
		cl.countDown();	
		LocalDateTime date2=LocalDateTime.now();
		Duration.between(date1, date2).toMinutes();
		return e;
	}

}
