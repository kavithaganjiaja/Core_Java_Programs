package ForLoopAssignments;

import java.util.Scanner;

public class LCMofTwoNumbers35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n1=sc.nextInt();
		System.out.println("Enter another Number:");
		int n2=sc.nextInt();
		int max=(n1>n2)?n1:n2;
		int lcm=max;
		for(int i=max;i<=n1*n2;i++)
		{

			if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;

		}
				
		}

System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);

        sc.close();

		
	}

}
