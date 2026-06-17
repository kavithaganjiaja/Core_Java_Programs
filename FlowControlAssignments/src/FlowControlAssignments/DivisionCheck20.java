package FlowControlAssignments;

import java.util.Scanner;

public class DivisionCheck20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter obtained Total marks out of 600:");
		int totalMarks=sc.nextInt();
		float percentage=(totalMarks*100)/600;
		if(percentage>=60)
			System.out.println("First Division");
		else if(percentage>=45)
			System.out.println("Second Division");
		else if(percentage>=30)
			System.out.println("Third Division");
		else
		{
			System.out.println("Fail");
		}
		sc.close();
		
			
		

	}

}
