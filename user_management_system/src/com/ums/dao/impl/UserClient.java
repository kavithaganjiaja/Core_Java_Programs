package com.ums.dao.impl;

import java.util.Scanner;

public class UserClient {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	UserDaoImpl daoImpl=new UserDaoImpl();
	while(true) {
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. ForgotPassword");
		System.out.println("4. Exit");
		System.out.println("======================");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			daoImpl.register();
			break;
		case 2:
			System.out.println("Enter email:");
			String email=sc.next();
			System.out.println("Enter password");
			String pass=sc.next();
			boolean verification=daoImpl.verifyEmailandPassword(email, pass);
			if(verification==true) 
				System.out.println("Valid Credentials");
				else
					System.out.println("Invalid Credentials");
			break;
		case 3:
			System.out.println("Enter email");
			String mail=sc.next();
			String ms=daoImpl.forgotPassword(mail);
			System.out.println("Password:"+ms);
			break;
		case 4:
			System.out.println("Thank YOu");
			System.exit(0);
			break;
		default:
			System.out.println("choose 1-4");
			
		
		}//end of switch
		
	}// end of while 
	}

}

