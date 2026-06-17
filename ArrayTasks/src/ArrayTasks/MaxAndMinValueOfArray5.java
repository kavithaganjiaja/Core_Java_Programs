package ArrayTasks;

import java.util.Scanner;

public class MaxAndMinValueOfArray5 {
	static public void maxMin(int ar[]) {
		int max = ar[0], min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i])
				max = ar[i];
			else if (min > ar[i])
				min = ar[i];

		}
		System.out.println("\nMaximum Value of Array is " + max);
		System.out.println("Manimum Value of Array is " + min);

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
		System.out.println("The given array:");
		for (int j = 0; j < arrSize; j++) {
			System.out.print(arr[j] + " ");
		}

		maxMin(arr);

		sc.close();
	}

}
