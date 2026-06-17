package ArrayTasks;

import java.util.Scanner;

public class ClassTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowSize = sc.nextInt();
		System.out.println("Enter column size:");
		int colSize = sc.nextInt();
		int[][] arr = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++) {
			System.out.println("Enter " + (i + 1) + "-row elements:");
			for (int j = 0; j < colSize; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();
		}
		int totalElements = rowSize * colSize;
		int[] newArr = new int[totalElements];
		for (int i = 0; i < totalElements; i++)
			System.out.println(newArr[i]);

		sc.close();

	}

}
