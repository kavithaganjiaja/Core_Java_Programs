package com.aja.dao.impl;

import java.util.Scanner;

import com.aja.pojo.Employee;

public class EmployeeDaoImpl {
	Scanner sc=new Scanner(System.in);
	Employee[] addEmployees=new Employee[3];
	public void addEmployeeInfo() {
		for(int i=0;i<addEmployees.length;i++) {
		System.out.println("Enter Employee ID:");
		int empID=sc.nextInt();
		System.out.println("Enter Employee name:");
		String empName=sc.next();
		System.out.println("Enter Employee address:");
		String empAdd=sc.next();
		System.out.println("Enter Employee Email:");
		String empEmail=sc.next();
		Employee emp=new Employee(empID,empName,empAdd,empEmail);
		addEmployees[i]=emp;
		}
		System.out.println("Employees details added Successfully!!!!");
				
	}// End of addEmployees
	public Employee[] viewAllEmployeesRecords() {
		
		return addEmployees;
	}//End of viewAllEmployeesRecords
	
	public Employee viewEmployee(int eno) {
		for(Employee emp:addEmployees) {
			if(emp.getEmpID()==eno)
				return emp;
		}
		return null;
			
	}//End of viewEmployee

}
