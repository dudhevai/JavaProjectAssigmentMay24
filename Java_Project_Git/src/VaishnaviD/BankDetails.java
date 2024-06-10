package VaishnaviD;

class BankDetails{
	int initbalance = 1000;
	
	void debitAmt(int debitamount){
		initbalance = initbalance-debitamount;
	}
	
	void creditAmt(int creditamount){
		initbalance=initbalance+creditamount;
	}

	void printBalance(){
		System.out.println("Current Balance amount is : " + initbalance );
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmt(300);
		bankdetails.creditAmt(500);
		bankdetails.creditAmt(200);
		bankdetails.creditAmt(800);
		bankdetails.debitAmt(1800);
		bankdetails.printBalance();
	}
}	