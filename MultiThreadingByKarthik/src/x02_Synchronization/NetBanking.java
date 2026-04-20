package x02_Synchronization;

public class NetBanking extends Thread {
BankOfAmerica accnt =null;
	
	NetBanking(BankOfAmerica accnt){
		 this.accnt=accnt;
	}
	
	public void run() {
		accnt.deposite(7000);
	}

}
