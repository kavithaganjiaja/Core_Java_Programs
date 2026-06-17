package ConstructorTasks;

import java.util.Scanner;

public class Employee {
	int eno;
	String ename;
	

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno:");
		int eno=sc.nextInt();
		System.out.println("enter EmpName");
		String ename=sc.next();
		Employee e=new Employee(eno,ename);
		System.out.println("EmpID:"+eno+"\tEmpName:"+ename);
	}

}
