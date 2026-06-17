package bankingSystem;

import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.Saving Account creation");
			System.out.println("2.Current Account creation");
			System.out.println("3.withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.Exit");
			System.out.println("enter a choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				ba.setAccountType("saving");
				System.out.println("Enter Acount Holder name:");
				ba.setAccountHolderName(sc.next());
				ba.setAccountNumber(1265437);
				System.out.println("Enter account opening amount(minimum of 1000):");
				double d=sc.nextDouble();
				if(d<1000) {
					System.out.println("Enter account opening amount(minimum of 1000):");
					
				}
				else {
					
				ba.setBalance(d);
				System.out.println("Account created successfully");
				System.out.println(ba.getAccountHolderName()+"\t\t"+ba.getAccountNumber()+"\t"+ba.getAccountType()+"\t"+ba.getBalance());
				}
				
				
				break;
			case 2:
				ba.setAccountType("current");
				System.out.println("Enter Acount Holder name:");
				ba.setAccountHolderName(sc.next());
				ba.setAccountNumber(653999);
				System.out.println("Enter account opening amount(minimum of 5000):");
				if(sc.nextDouble()<5000) {
					System.out.println("Enter account opening amount(minimum of 5000):");
				}
				else {
				ba.setBalance(sc.nextDouble());
				}
				break;
			case 3:
				System.out.println("enter withdraw amount:");
				ba.withdraw(sc.nextDouble());
				break;
			case 4:
				System.out.println("enter deposit amount:");
				ba.deposit(sc.nextDouble());
		
				break;
			case 5:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				System.out.println("choose between 1-5");
					
						
			}//end of switch
			
			
			
		}//end of while
		
		

	}

}
