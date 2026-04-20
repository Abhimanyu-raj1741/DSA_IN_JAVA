package x02_Synchronization;

public class ATM extends Thread  {
	
	BankOfAmerica accnt =null;
	
	ATM(BankOfAmerica accnt){
		 this.accnt=accnt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		accnt.withDraw(9000);
		
	} 

}
