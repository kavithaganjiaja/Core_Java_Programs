package ArrayTasks;

import java.util.Scanner;

public class SumOfElementOfArray23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		int sum = 0;
		System.out.println("Eneter elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		for (int x = 0; x < 5; x++) {
			sum = sum + ar[x];

		}
		System.out.println("Sum of Array Elements: " + sum);
		sc.close();
	}

}
