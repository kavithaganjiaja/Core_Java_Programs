package bankingSystem;

public class SavingAccount extends BankAccount {
	private double interestRate = 4.0; 
BankAccount b=new BankAccount();
	public void addInterest() { 
		if(b.getAccountType()=="saving") {
	double interest = getBalance() * interestRate / 100; 
	deposit(interest);
	System.out.println("After adding the interest, Available balance is "+b.getBalance());
		}
	}
}
