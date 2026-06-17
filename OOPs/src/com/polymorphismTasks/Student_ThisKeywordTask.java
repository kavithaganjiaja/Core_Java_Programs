package com.polymorphismTasks;

public class Student_ThisKeywordTask {
	String studentName;
	int age;
	// Note that in the Constructor below "this keyword" is
    // used to differentiate between the local variable and
    // the instance variable.

	public Student_ThisKeywordTask(String studentName,int age) {
		// Assigns the value of local name variable
        // to the name(instance variable).
		this.studentName=studentName;
		this.age=age;
		
		
	}
	public void display() {
		System.out.println(this.studentName+"\t"+this.age);
		
	}

	public static void main(String[] args) {
		// Creating new instance of Student Class
		Student_ThisKeywordTask s=new Student_ThisKeywordTask("veda",10);
		s.display();
		

	}

}
