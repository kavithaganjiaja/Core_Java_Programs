package com.polymorphismTasks;

public class Student_ThisOfTask {
	
	public Student_ThisOfTask(String name) {
		this(20);

		System.out.println(name);
	}
	public Student_ThisOfTask(int age) {
		System.out.println(age);
		
	}
	public Student_ThisOfTask() {
		this("kavitha");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Student_ThisOfTask();
		
	}

}
