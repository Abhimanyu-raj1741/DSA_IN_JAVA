package x19_InheritanceConceptc;

public class Car extends Engine {
	 
	 String temp = "Car";
	 
	 public Car() {
		  System.out.println("This is Car cons");
	 }
	 
	  void display() {
		  System.out.println("Car"+ super.temp);
	 }
	 
	 
	 public static void main(String[] args) {
		  Car c1 = new Car();
		  System.out.println();
		  c1.display();
	}

}
