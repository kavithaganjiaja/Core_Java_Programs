package com.polymorphismTasks;

public class MethodOverloadingTask {
	void add(int fno, int sno, int tno) {
		System.out.println("addition: " +(fno+sno+tno));
	}

	void add(int fno, int sno) {
		System.out.println("addition: " +(fno+sno));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTask mot=new MethodOverloadingTask();
		mot.add(100,200);
	}

}
