package FlowControlAssignments;

import java.util.Scanner;

public class VotingAgeValidation19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		byte age=sc.nextByte();
		if(age>=18)
		{
			System.out.println("You are a major, eligible for vote");
		}
		else
		{
		System.out.println("Your are not eligible for vote because you are a minor");
		}
		
		sc.close();
	}

}
