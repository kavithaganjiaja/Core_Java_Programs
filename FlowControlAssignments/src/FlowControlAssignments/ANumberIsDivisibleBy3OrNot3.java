package FlowControlAssignments;

import java.util.Scanner;

public class ANumberIsDivisibleBy3OrNot3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%3==0)
		{
			System.out.println(+n+" is divisible by 3");
			
		}
		else
			System.out.println(+n+" is NOT divisible by 3");
		sc.close();

	}

}
