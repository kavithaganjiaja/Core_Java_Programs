package fundamentals;

public class Task4BankAccount {
	String accountNumber="00012435678";
	String accountHolderName="Kavitha";
	double balance=0;
	
	double deposit(double amount)
	{
		double intialBalance=balance;
		System.out.println("Previous Balance: "+intialBalance);
		balance= balance+amount;
		return balance;
	}

	public static void main(String[] args) {
		
		Task4BankAccount tba=new Task4BankAccount();
		
		System.out.println("Account Number: "+tba.accountNumber);
		System.out.println("Name: "+tba.accountHolderName);
		
		
		System.out.println("Current Balance: "+tba.deposit(5000));
		
		System.out.println("Current Balance: "+tba.deposit(10000));
		
		System.out.println("Current Balance: "+tba.deposit(2000));
		
		
		
	}

}
