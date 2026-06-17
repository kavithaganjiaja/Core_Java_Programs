package com.aja.dao.impl;

import java.util.Scanner;

import com.aja.pojo.Student;

public class StudentDaoImpl {
	Scanner sc=new Scanner(System.in);
	Student[] addStudents=new Student[3];
	//add student details
	public void addStudentInfo() {
		for(int i=0;i<addStudents.length;i++) {
		System.out.println("Enter Student number:");
		int sno=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		System.out.println("Enter Student Email:");
		String semail=sc.next();
		System.out.println("Enter Student Address:");
		String sadd=sc.next();
		Student student=new Student(sno,sname,semail,sadd);
		addStudents[i]=student;
		System.out.println("Student Information added successfully!");
		}//End of For
	}
	//end of add Student
	//view all student info
	public Student[] viewAllStudents() {
		return addStudents;
		}//end of view all students info
	public Student viewStudent(int sno) {
		for(Student st:addStudents) {
			if(st.getSno()==sno) {
				return st;
			}
		}
		return null;
	}//end of viewStudent

}

