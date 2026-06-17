package FlowControlAssignments;

import java.util.Scanner;

public class WeekDay16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Week number:");
		int weekNum=sc.nextInt();
		if(weekNum==1) 
			System.out.println("It is Monday");
		else if(weekNum==2)
			System.out.println("Is is Tuseday");
		else if(weekNum==3)
			System.out.println("Is is Wednesday");
		else if(weekNum==4)
			System.out.println("Is is Thursday");
		else if(weekNum==5)
			System.out.println("Is is Friday");
		else if(weekNum==6)
			System.out.println("Is is Saturday");
		else if(weekNum==7)
			System.out.println("Is is Sunday");
		else
			System.out.println("Invalid Week Number.Week Number should be 0 to 1");
		sc.close();
		

	}

}
