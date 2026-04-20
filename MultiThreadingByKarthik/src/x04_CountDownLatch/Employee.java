package x04_CountDownLatch;

public class Employee {
	private int empId;
	private String empName;
	private double perDayBasicSalary;
	private int noOfWorkingDays;
	
	
	public Employee(int empId, String empName, double perDayBasicSalary, int noOfWorkingDays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.perDayBasicSalary = perDayBasicSalary;
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getEmpId() {
		
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getPerDayBasicSalary() {
		return perDayBasicSalary;
	}
	public void setPerDayBasicSalary(double perDayBasicSalary) {
		this.perDayBasicSalary = perDayBasicSalary;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	
	
	

}
