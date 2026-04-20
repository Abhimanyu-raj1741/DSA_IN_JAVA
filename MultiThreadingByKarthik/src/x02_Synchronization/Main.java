package x02_Synchronization;

public class Main {
	
	public static void main(String[] args) {
		 
		BankOfAmerica abhi = new BankOfAmerica();
		BankOfAmerica anuj = new BankOfAmerica();
		abhi.balance=18000;
		anuj.balance=25000;
		
		ATM atm = new ATM(abhi);
		NetBanking netBanking = new NetBanking(abhi);
		atm.start();
		netBanking.start();
	}

}
