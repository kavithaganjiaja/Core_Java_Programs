package ForLoopAssignments;

import java.util.Scanner;

public class NaturanNumbersReverseOrder9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("upto which do you want to print:");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			System.out.println(i);
		}
		sc.close();


	}

}
