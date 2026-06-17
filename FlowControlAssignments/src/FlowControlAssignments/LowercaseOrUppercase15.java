package FlowControlAssignments;

import java.util.Scanner;

public class LowercaseOrUppercase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Alphabet:");
		char ip=sc.next().charAt(0);
		
		if((ip>='a' && ip<='z'))
		{
			System.out.println("The Given Alphabet is in lowerCase");
		}
		else if(ip>='A' && ip<='Z')
			System.out.println("The Given Alphabet is in lowerCase");
		else
			System.out.println("It is not a Alphabet");
		sc.close();
	}

}
