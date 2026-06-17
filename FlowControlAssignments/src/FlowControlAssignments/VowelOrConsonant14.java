package FlowControlAssignments;

import java.util.Scanner;

public class VowelOrConsonant14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Alphabet:");
		char c=sc.next().charAt(0);
		
		if(c=='a'||c=='e' || c=='i' || c=='u'|| c=='o')
		{
			System.out.println("The give Alphabet  is a Vowel");
		}
		else
			System.out.println("The given Alphabet is a Consonant");
		sc.close();
		
	}

}
