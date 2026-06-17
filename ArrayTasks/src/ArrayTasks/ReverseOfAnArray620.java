package ArrayTasks;

import java.util.Scanner;

public class ReverseOfAnArray620 {
	static public void reverse(int ar[]) {
		System.out.println("\nReverse of Given Array is: ");
		for (int j = ar.length - 1; j >= 0; j--)
			System.out.print(+ar[j] + " ");
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
		reverse(arr);
		sc.close();
	}

}
