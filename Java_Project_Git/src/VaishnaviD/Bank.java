package VaishnaviD;

public class Bank {
	int balance=1000;
	
	void debitAmt(int damt) {
		balance = balance - damt;
	}
	
	void creditAmt(int camt) {
		balance = balance + camt;
	}
	
	void printBalance() {
		System.out.println("Current balance is : "+balance);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(300);
		bank.creditAmt(300);
		bank.creditAmt(300);
		bank.debitAmt(200);
		bank.printBalance();
	}

}
