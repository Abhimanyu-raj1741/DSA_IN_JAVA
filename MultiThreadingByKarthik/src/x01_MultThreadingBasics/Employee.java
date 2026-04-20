package x01_MultThreadingBasics;

public class Employee {
     
	 private int empId;
	 private double empsalary;
	 private String empName;
	 private double basicSalaryPerDay;
	 
	 
	 
	 
	 
	 public Employee(int empId,  String empName, double basicSalaryPerDay) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalaryPerDay = basicSalaryPerDay;
	}
	 public int getEmpId() {
		 return empId;
	 }
	 public void setEmpId(int empId) {
		 this.empId = empId;
	 }
	 public double getEmpsalary() {
		 return empsalary;
	 }
	 public void setEmpsalary(double empsalary) {
		 this.empsalary = empsalary;
	 }
	 public String getEmpName() {
		 return empName;
	 }
	 public void setEmpName(String empName) {
		 this.empName = empName;
	 }
	 public double getBasicSalaryPerDay() {
		 return basicSalaryPerDay;
	 }
	 public void setBasicSalaryPerDay(double basicSalaryPerDay) {
		 this.basicSalaryPerDay = basicSalaryPerDay;
	 }
	 
	 
	 
}
