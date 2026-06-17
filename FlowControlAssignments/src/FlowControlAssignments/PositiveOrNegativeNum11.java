package FlowControlAssignments;

import java.util.Scanner;

public class PositiveOrNegativeNum11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		double n=sc.nextDouble();
		if(n<0)
		{
			System.out.println("The given number is negative number");
		}
		else if(n>0)
			System.out.println("The given number is positive number");
		else
			System.out.println("The given number is Zero(0)");
		sc.close();

	}

}
