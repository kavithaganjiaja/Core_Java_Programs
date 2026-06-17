package FlowControlAssignments;

import java.util.Scanner;

public class FahrenhitToCelsius13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temprature in Fahrenhit:");
		float fahrenhit=sc.nextFloat();
		if(fahrenhit>=-459.67)
		{
			float celsius=(fahrenhit-32)*5/9;
			System.out.println("Fahrenhit:"+celsius);
		}
		else
			System.out.println("Invalid temp we can't convert into celsius");
		sc.close();
		

	}

}
