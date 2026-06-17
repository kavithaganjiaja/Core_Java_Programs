package ForLoopAssignments;

import java.util.Scanner;

public class NaturalNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("upto which do you want to print:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		sc.close();

	}

}
