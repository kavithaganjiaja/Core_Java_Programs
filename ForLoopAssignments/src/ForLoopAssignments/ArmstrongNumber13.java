package ForLoopAssignments;

import java.util.Scanner;

public class ArmstrongNumber13 {

	public static void main(String[] args) {
		 //Armstrong Number is a positive integer that equals the sum of its own digits, 
		//each raised to the power of the total number of digits in the number.  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=sc.nextInt();
		String s=Integer.toString(number);
		int digits=s.length();
		double sum = 0;
		
        // Using a for loop to iterate through each digit
		for(int i=0;i<digits;i++) {
            // Get the numeric value of each character
            int n = Character.getNumericValue(s.charAt(i));
            sum += Math.pow(n, digits);
        }

        if ((int)sum == number) {
            System.out.println(number + " is an Armstrong number.");
         
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
		
		
        sc.close();

		
		
	}

}
