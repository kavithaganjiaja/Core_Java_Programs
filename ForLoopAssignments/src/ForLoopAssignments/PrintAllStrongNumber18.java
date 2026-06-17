package ForLoopAssignments;

import java.util.Scanner;

public class PrintAllStrongNumber18 {

	public static void main(String[] args) {
		// a strong number is a number whose value equals the sum of the factorials of
		// its digits.
		Scanner sc = new Scanner(System.in);
        System.out.println("Upto which number do you want to print:");
        int n = sc.nextInt();

        // Loop from 1 to the user's limit
        for (int i = 1; i <= n; i++) {
            int tempNumber = i; 
            int sum = 0; // RESET sum for every new number 'i'

            // Extract digits and calculate factorial sum
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                
                int f = 1; // RESET factorial for every new digit
                for (int j = 1; j <= digit; j++) {
                    f = f * j;
                }
                
                sum = sum + f;
                tempNumber = tempNumber / 10;
            }

            // Compare the factorial sum with the current loop number 'i'
            if (sum == i) {
                System.out.println(i);
            }
        }
        sc.close();


	}

}
