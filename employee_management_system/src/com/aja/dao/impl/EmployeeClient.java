package com.aja.dao.impl;

import java.util.Scanner;

import com.aja.pojo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDaoImpl daoImpl=new EmployeeDaoImpl();
		while(true) {
			System.out.println("=========================");
			System.out.println("1.AddEmployeeInfo");
			System.out.println("2.ViewAllEmployees");
			System.out.println("3.ViewEmployee");
			System.out.println("4.Exit");
			System.out.println("=========================");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.addEmployeeInfo();
				break;
			case 2:
				Employee[] viewAllEmps=daoImpl.viewAllEmployeesRecords();
				for(Employee e:viewAllEmps)
					System.out.println(e.getEmpID()+"\t"+e.getEmpName()+"\t"+e.getEmpAdd()+"\t"+e.getEmpEmail());
				break;
			case 3:
				System.out.println("Enter Employee ID:");
				Employee emp=daoImpl.viewEmployee(sc.nextInt());
				if(emp!=null) {
					System.out.println(emp.getEmpID()+"\t"+emp.getEmpName()+"\t"+emp.getEmpAdd()+"\t"+emp.getEmpEmail());
				}
				else {
					System.out.println("Record is not exist");
				}
				break;
			case 4:
				System.out.println("Thank you for using this APP!");
				System.exit(0);
			default:
				System.out.println("Invalid choice, choose between 1 to 4");
				break;
		
					
			}// end of switch
			
		}// end of while
	}

}
