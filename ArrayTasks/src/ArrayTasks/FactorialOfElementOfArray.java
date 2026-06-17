package ArrayTasks;

import java.util.Scanner;

public class FactorialOfElementOfArray {
	static void factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)// i=1,1<=4,f=1*1,f=1;2,2<=4,f=1*2;
		{
			f = f * i;

		}
		System.out.println(+n + " factorial is " + f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int ar[]= {4,5,6,2};
		int ar[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for (int j = 0; j < ar.length; j++) {
			ar[j] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			factorial(ar[i]);// ar[0]=4
		}
		sc.close();
	}

}
