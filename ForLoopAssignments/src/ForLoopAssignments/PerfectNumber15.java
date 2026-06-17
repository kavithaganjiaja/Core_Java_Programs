package ForLoopAssignments;

import java.util.Scanner;

public class PerfectNumber15 {

	public static void main(String[] args) {
		
		//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding itself. 
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter a number:");
	int n=sc.nextInt();
	int sum=0;
	int i;
	System.out.println("divisors of "+n+":");
	//sum=sum+i;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.print(+i+" ");
			sum=sum+i;
		}
	}
	
	if(sum==n)
	{
	System.out.println("\n"+n+" is a Perfect Number");
	}
sc.close();
}
}