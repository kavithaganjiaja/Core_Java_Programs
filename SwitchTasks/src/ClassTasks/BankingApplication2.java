package ClassTasks;

import java.util.Scanner;

public class BankingApplication2 {
	static long balance=5000l;

	int penality=100;
	
	void deposit(long dep_amount) {
		if(balance>=5000)
		{
		balance=balance+dep_amount;
		System.out.println("Successfully Rs. "+dep_amount+"/- Deposited!");
		System.out.println("Available Balance is "+balance);
		}
		else
		{
			balance=balance+dep_amount;
			balance=balance-penality;
			System.out.println("Successfully Rs. "+dep_amount+"/- Deposited!");
			System.out.println("Because of low balance Rs. 100/- deducted from your account");
			System.out.println("Availabe Balance is " +balance);
		}
			
		}
	void withdraw(long wid_Amount)
	{
	if(wid_Amount<balance)	
	{
		balance=balance-wid_Amount;
		System.out.println("Rs. "+wid_Amount+"/- deducted from your Account.");
		System.out.println("Available Balance is "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance!");
			System.out.println("Balance:"+balance);
		}
	}
	void display()
	{
		System.out.println("Available Balance is "+balance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		BankingApplication2 d=new BankingApplication2();
		do {
			
		System.out.println("-----------------------");
		System.out.println("Services:");
		System.out.println("-----------------------");
		System.out.println("  1.Deposit   ");
		System.out.println("  2.Withdraw         ");
		System.out.println("  3.Balance Check   ");
		System.out.println("  4.Exit   ");
		System.out.println("------------------------");
		System.out.println("\nWhich service do you want?");
		choice=sc.nextInt();
		long depAmt,widAmt;
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter Deposit Amount:");
			depAmt=sc.nextLong();
			d.deposit(depAmt);
			break;
		case 2:
			
			System.out.println("Enter Wirthdraw Amount:");
			widAmt=sc.nextLong();
			d.withdraw(widAmt);
			break;
		case 3:
			
			d.display();
			break;
		case 4:
			System.exit(0);
			
		default:
			System.out.println("			Invalid choice! Please choose 1 to 3");
			BankingApplication2.main(null);
			
			
		}
		
		}while(choice!=4);

	sc.close();
	}

}
