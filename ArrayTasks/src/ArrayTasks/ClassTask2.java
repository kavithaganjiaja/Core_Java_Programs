package ArrayTasks;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		String str[] = new String[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st value:");
		String s = sc.nextLine();
		str[0] = s;
		System.out.println("Enter 2nd value:");
		String s2 = sc.nextLine();
		str[1] = s2;
		System.out.println("Enter 3rd value:");
		String s3 = sc.nextLine();
		str[2] = s3;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		sc.close();
	}

}
