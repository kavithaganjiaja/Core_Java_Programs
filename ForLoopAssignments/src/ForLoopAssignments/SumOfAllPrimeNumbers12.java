package ForLoopAssignments;

import java.util.Scanner;

public class SumOfAllPrimeNumbers12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto which do you want print:");
		int nn = sc.nextInt();
		int sum = 0;
		for (int n = 2; n <= nn; n++) {
			boolean isPrime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break; 
				}

			}
			if (isPrime)

				System.out.print(+n + " ");
				sum+=n;
				
		}
		
		System.out.println("Sum of Prime number is :"+sum);
		sc.close();
}

}
