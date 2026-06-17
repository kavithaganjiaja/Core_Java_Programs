package FlowControlAssignments;
import java.util.Scanner;



public class MaxOfTwoNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=sc.nextInt();
		
		if(num1<num2)
		{
			System.out.println("Maximum of two numbers is:"+num2);
		}
		else
			System.out.println("Maximum of two numbers is:"+num1);
		sc.close();
		


	}

}
