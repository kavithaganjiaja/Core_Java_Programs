package ForLoopAssignments;

import java.util.Scanner;

public class PallindromeNumber25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int originalnum=n,reverse=0;
		for(int i=n;i>0;i=i/10) {
			int digit=i%10;
			reverse=reverse*10+digit;
			
		}
		if(originalnum==reverse)
		{
			System.out.println(originalnum+" is a pallindrome");
		}
		else {
			System.out.println(originalnum+" is not a pallindrome");
		}
		sc.close();
	}

}
