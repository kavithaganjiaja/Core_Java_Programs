package FlowControlAssignments;

import java.util.Scanner;

public class AlphabetOrNot9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String/Alphabet:");
		String s=sc.nextLine();
		if((s.length())==1)
		{
			System.out.println("The Given I/P is a Alphabet");
		}
		else
			System.out.println("The Given I/P is NOT Alphabet");
		sc.close();
	}

}
