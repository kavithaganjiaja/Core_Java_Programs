package com.polymorphismTasks;

public class ConstructorOverloadingTask {
	public ConstructorOverloadingTask() {
		
		System.out.println("Default Constructor");
		
	}
public ConstructorOverloadingTask(int i) {
	this();// it calls the default constructor.it should be 1st stmt.
	System.out.println("Parameterised Constructor");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ConstructorOverloadingTask(10);
	}

}
