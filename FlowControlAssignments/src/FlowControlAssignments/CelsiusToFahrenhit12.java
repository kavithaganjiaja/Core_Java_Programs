package FlowControlAssignments;

import java.util.Scanner;

public class CelsiusToFahrenhit12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temprature in Celcius:");
		double celcius=sc.nextFloat();
		if(celcius>=-273.5)
		{
			double fahrenhit=(celcius*9.0/5.0)+32;
			System.out.println("Fahrenhit:"+fahrenhit);
		}
		else
			System.out.println("Invalid temp we can't convert into fahrenhit");
		sc.close();
		
		
	}

}
