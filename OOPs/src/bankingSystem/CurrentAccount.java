package bankingSystem;

public class CurrentAccount extends BankAccount {
	 private double overdraftLimit = 5000; 
	 BankAccount b=new BankAccount();
	    public void withdraw(double amount) { 
	    	if(b.getAccountType()=="current") {
	        if (amount <= getBalance() + overdraftLimit) { 
	            super.withdraw(amount); 
	        } else { 
	            System.out.println("Overdraft limit exceeded"); 
	        } 
	    	}
	    } 


}
