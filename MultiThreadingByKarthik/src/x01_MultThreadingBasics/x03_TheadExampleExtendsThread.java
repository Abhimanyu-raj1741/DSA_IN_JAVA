package x01_MultThreadingBasics;

public class x03_TheadExampleExtendsThread  extends Thread{

	public x03_TheadExampleExtendsThread() {
		super();
		// TODO Auto-generated constructor stub
	}  
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}

	public static void main(String[] args) {

		x03_TheadExampleExtendsThread t1 = new x03_TheadExampleExtendsThread();

		t1.start();
		x03_TheadExampleExtendsThread t2 = new x03_TheadExampleExtendsThread();

		t2.start();
		x03_TheadExampleExtendsThread t3 = new x03_TheadExampleExtendsThread();

		t3.start();


	}



}
