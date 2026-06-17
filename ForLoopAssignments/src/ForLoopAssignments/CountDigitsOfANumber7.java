package ForLoopAssignments;

import java.util.Scanner;

public class CountDigitsOfANumber7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=0;		
		for(;n!=0;n/=10,++count)
		{
			
		}
		System.out.println("Number of digits: "+count);
		sc.close();
	}

}
