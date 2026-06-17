package ForLoopAssignments;

import java.util.Scanner;

public class SwapTwoNumbers20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter another number:");
		int b=sc.nextInt();
		System.out.println("Before swapping a,b values:"+a+"\t"+b);
		int temp=0;
		for(int i=0;i<1;i++)
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println("After swapping a,b values:"+a+"\t"+b);
	sc.close();
	}

}
