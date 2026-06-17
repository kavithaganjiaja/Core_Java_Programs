package ForLoopAssignments;

import java.util.Scanner;

public class SumOfDigitsOfaNumber8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;		
		for(;n!=0;n=n/10)
		{
			sum+=n%10;
		}
		System.out.println("Number of digits: "+sum);
		sc.close();

	}

}
