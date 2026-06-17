package fundamentals;

public class BankingApplication {

	String accountHolderName="kavitha";
	long balance;
	

	void deposit(long damount) {
		long initialBal = balance;
		balance = balance + damount;
		System.out.println("Previous Balance:" + initialBal);
		System.out.println("Deposit Amount:"+damount);
		System.out.println("Current Balance:" + balance);
	}
	void withdraw(long wamount) {
		long initialBal = balance;
		balance = balance - wamount;
		System.out.println("Previous Balance:" + initialBal);
		System.out.println("Withdrawal Amount:"+wamount);
		System.out.println("Current Balance:" + balance);
	}
	public static void main(String[] args) {
		BankingApplication ba=new BankingApplication();
		System.out.println("Account Holder NAme:"+ba.accountHolderName);
		ba.deposit(10000);
		ba.withdraw(3000);
		
		
	}

}
