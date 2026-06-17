package ArrayTasks;

import java.util.Scanner;

public class EvenOrOddElements13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		System.out.println("Eneter elements");
		for (int i = 0; i < 5; i++) {
			int j = sc.nextInt();
			ar[i] = j;

		}
		System.out.println("Even Elements:");
		for (int x = 0; x < 5; x++) {
			if (ar[x] % 2 == 0)
				System.out.print(ar[x]+" ");
		}
		System.out.println("\nOdd Elements:");
		for (int x = 0; x < 5; x++) {
			if (ar[x] % 2 != 0)
				System.out.print(ar[x]+" ");
		}
		sc.close();

	}

}
