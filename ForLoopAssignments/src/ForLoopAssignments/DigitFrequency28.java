package ForLoopAssignments;

import java.util.Scanner;

public class DigitFrequency28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int[] freq=new int[10];

		for (int i = n; i > 0; i = i / 10) {
            int digit = i % 10;
            freq[digit]++;
        }

System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " : " + freq[i]);
            }
        }

        sc.close();


	}

}
