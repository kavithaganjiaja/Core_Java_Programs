package ArrayTasks;

import java.util.Scanner;

public class IsAValueInArray2 {
	static void findValue(int v, int ar[]) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == v) {
				isPresent = true;
				break;
			}
		}
		if (isPresent == true) {
			System.out.println(+v + " is present in the Array");
		} else {
			System.out.println(+v + " is not present in the Array");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 7, 2, 40, 15, 60, 54 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int n = sc.nextInt();
		findValue(n, arr);

		sc.close();
	}

}
