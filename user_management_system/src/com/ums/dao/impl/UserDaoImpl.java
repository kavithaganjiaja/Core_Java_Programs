package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.pojo.User;

public class UserDaoImpl {
	Scanner sc=new Scanner(System.in);
	User[] user=new User[3];
	
	public void register() {
		for(int i=0;i<user.length;i++) {
			System.out.println("Enter UserID");
			int userId=sc.nextInt();
			System.out.println("Enter first name");
			String firstName=sc.next();
			System.out.println("Enter last name");
			String lastName=sc.next();
			System.out.println("Enter Email:");
			String email=sc.next();
			System.out.println("Enter password:");
			String password=sc.next();
			User u=new User(userId,firstName,lastName,email,password);
			user[i]=u;
			System.out.println("Hi "+firstName+", Registered Successfully");
		}	
		
	}//End of Register
	
	public boolean verifyEmailandPassword(String email,String password) {
		for(User user:user) {
			if(user.getEmail().equals(email)&&user.getPassword().equals(password))
			{
			return true;
			}
		}
				return false;
		}
		
	
public String forgotPassword(String email) {
	for(User user:user) {
		if(user.getEmail().equals(email))
		{
		return user.getPassword();
		}
	}
			return null;
	}
}
