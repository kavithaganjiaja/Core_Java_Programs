package ForLoopAssignments;

import java.util.Scanner;

public class PrimeNumberOrNot10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		if(n<=1)
		{
			System.out.println("is not a Prime Nume");
			return;
		}
		
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.println(+n+" is a Prime Number");
		
		}
		else
		{
			System.out.println(+n+" is not a Prime Number");
		}
		
		sc.close();
		
		
		
	}

}
