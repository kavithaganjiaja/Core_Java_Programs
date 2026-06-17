package FlowControlAssignments;

import java.util.Scanner;

public class InputType10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char/digit/special char:");
		char ip = sc.next().charAt(0);

		if ((ip >= 'a' && ip <= 'z') || (ip >= 'A' && ip <= 'Z')) {
			System.out.println("It is a Alphabet");
		} else if (ip >= '0' && ip <= '9')
			System.out.println("It is a Digt");
		else
			System.out.println("It is a Special Character");

		sc.close();
	}

}
