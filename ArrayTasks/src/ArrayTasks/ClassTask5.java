package ArrayTasks;

import java.util.Scanner;

public class ClassTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter " + (i + 1) + "-row elements:");
			for (int j = 0; j < 3; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);

				sum += arr[i][j];

			}
			System.out.print("  " + sum);
			System.out.println();
		}
		sc.close();

	}

}
