package com.aja.dao.impl;

import java.util.Scanner;

import com.aja.pojo.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentDaoImpl daoImpl=new StudentDaoImpl();
		while(true) {
			System.out.println("==========================================");
			System.out.println("           1.AddStudent                   ");
			System.out.println("           2.ViewAllStudent               ");
			System.out.println("           3.ViewStudent                  ");
			System.out.println("           4.Exit                         ");
			System.out.println("Enter a choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				daoImpl.addStudentInfo();
				break;
			case 2:
				Student[] viewAllStudent=daoImpl.viewAllStudents();
				for(Student st:viewAllStudent) {
					System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd()+"\t"+st.getSemail());
					
				}
				break;
			case 3:
				System.out.println("Enter student number");
				Student vStudent=daoImpl.viewStudent(sc.nextInt());
				if(vStudent!=null) {
					System.out.println(vStudent.getSno()+"\t"+vStudent.getSname()+"\t"+vStudent.getSadd()+"\t"+vStudent.getSname());
				}
				else
				{
					System.out.println("Record not exits");
				}
				break;
			case 4:
				System.out.println("Thanks for using this app!");
				System.exit(0);
				break;
				default:
					System.out.println("Enter 1-4 choice:");
					
			
			}//end of switch
			
		}//en of while

	}

}
