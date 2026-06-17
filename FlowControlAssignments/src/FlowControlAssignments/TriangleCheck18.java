package FlowControlAssignments;

import java.util.Scanner;

public class TriangleCheck18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three sides of Triangle:");
		int side1=sc.nextInt();
		
		int side2=sc.nextInt();
		
		int side3=sc.nextInt();
			
		if(side1==side2 && side2==side3)
		{
			System.out.println("The given Triangle is an Equilateral Triangle");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("The given Triangle is an Isosceles Triangle");
		}
		else
		{
			System.out.println("The given Triangle is an Scalene  Triangle");
		}
		
		sc.close();
		

	}

}
