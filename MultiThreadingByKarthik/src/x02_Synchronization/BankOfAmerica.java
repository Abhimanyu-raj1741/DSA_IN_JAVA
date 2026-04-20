package x02_Synchronization;

public class BankOfAmerica {
	
	double balance; 
	
	// if we are using synchronized it means we are acquiring lock on object without static 
	// if we are using synchronized with static it acquire lock on class
	public synchronized void  withDraw(double amtToBeWithDrawn) {
		 if(balance>amtToBeWithDrawn) {
			  balance= balance-amtToBeWithDrawn;
		 }
	}
	
	public synchronized void deposite(double amtToDeposited ) {
		 balance+=amtToDeposited;
		 
	}
	
	public void fundTransfer(double amtToBeSent) {
		 balance-=amtToBeSent;
	}

}
