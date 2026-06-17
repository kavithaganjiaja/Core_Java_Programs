package com.encapsulationTasks;

public class AccountClient {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.deposit(10000);
		//ac.setOpeningBalance(10000);//we can't modify the openingBalance. But we can access
		System.out.println("Present balance is: "+ac.getOpeningBalance());
	}

}
