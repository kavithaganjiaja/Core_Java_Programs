package ForLoopAssignments;

import java.util.Scanner;

public class SumOfAllOddNumbers5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Upto which do you want to print/sum:");
		int k = sc.nextInt();
		int sum=0;
		for (int n = 2; n <= k; n++) {
			if (n % 2 != 0)
			{
				System.out.println(n);
			sum=sum+n;
			}
			
		}
		System.out.println(sum);
		sc.close();

	}

}
