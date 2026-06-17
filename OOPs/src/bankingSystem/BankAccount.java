package bankingSystem;

public class BankAccount {
private int accountNumber; 
private String accountHolderName; 
private double balance; 
private String accountType;

public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType=accountType;
}
public int getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}


public String getAccountHolderName() {
	return accountHolderName;
}


public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}

public BankAccount() {
	// TODO Auto-generated constructor stub
}
public void deposit(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println(+amount+" is credited successfully ");
		System.out.println("Now,Avialable balance is "+balance);
	}
	else
		{
		System.out.println("We can't deposit.Please deposit sufficient amount");
		
	}
	} 


public void withdraw(double amount) {
	if(balance>2000) {
		balance-=amount;
		System.out.println(+amount+" is debited");
		System.out.println("Now,Avialable balance is "+balance);
		
	}
	else{
		System.out.println("Insuffecient Balance!!!!");
		
	}
	
}


}
