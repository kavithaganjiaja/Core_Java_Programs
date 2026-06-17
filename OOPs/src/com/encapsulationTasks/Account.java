package com.encapsulationTasks;
//Encapsulated class
public class Account {
	private int openingBalance;//hidding the data can't be accessed directly from other classes
	public int getOpeningBalance() {
		return openingBalance;
	}
	/*public void setOpeningBalance(int openingBalance) {
		this.openingBalance=openingBalance;
	}*/
	// instead of setter method,we write deposit method
	public void deposit(int amount) {
		openingBalance+=amount;
	}

}
