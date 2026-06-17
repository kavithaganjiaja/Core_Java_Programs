package FlowControlAssignments;

import java.util.Scanner;

public class ANumberIsDivisibleBy11OrNot5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%11==0)
		{
			System.out.println(+n+" is divisible by 11");
			
		}
		else
			System.out.println(+n+" is NOT divisible by 11");
		sc.close();
	}

}
