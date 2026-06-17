package ArrayTasks;

import java.util.Scanner;

public class FindIndexOfAnElement3 {
	static void findIndex(int v, int ar[]) {
		boolean isPresent = false;
		int index = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == v) {
				index = i;
				isPresent = true;
				break;
			}
		}
		if (isPresent == true) {

			System.out.println("The Index of " + v + " is:" + index);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		System.out.println("Enter " + arrSize + " elements:");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Give Array is:");
		System.out.print("{");
		for (int i = 0; i < arrSize; i++) {
			System.out.print(arr[i] + ",");

		}
		System.out.println("}");
		System.out.println("Enter which number index do you want?");
		int n = sc.nextInt();
		findIndex(n, arr);
		sc.close();
	}

}
