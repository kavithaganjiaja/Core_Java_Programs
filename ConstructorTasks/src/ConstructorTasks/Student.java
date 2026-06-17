package ConstructorTasks;

import java.util.Scanner;

public class Student {
	int sno;
	String sname,saddress;
	long mobileNum;
	public Student(int sno,String sname,String saddress,long mobileNum){
		this.sno=sno;
		this.sname=sname;
		this.saddress=saddress;
		this.mobileNum=mobileNum;
	}
	
	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
		this.sno = sno;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}



	public long getMobileNum() {
		return mobileNum;
	}



	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int c=sc.nextInt();
		do {
		System.out.println("Services:");
		System.out.println("==============");
		System.out.println("1. Add Student Information");
		System.out.println("2. Display All Students");
		System.out.println("3. Update Student");
		System.out.println("3. delete Student");
		System.out.println("4. Exit");
		
		switch(c) {
		case 1:
			System.out.println("Enter Student number:");
			int no=sc.nextInt();
			System.out.println("Enter Student name:");
			String sn=sc.next();
			System.out.println("Enter Student address:");
			String sa=sc.next();
			System.out.println("Enter Student mobile number:");
			long m=sc.nextLong();
			new Student(no,sn,sa,m);
		case 2:
		case 3:
		case 4:
			System.exit(0);
		default:
				
		}
		}while(c!=4);
	sc.close();
	}

}
