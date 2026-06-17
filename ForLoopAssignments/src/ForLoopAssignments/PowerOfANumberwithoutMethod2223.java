package ForLoopAssignments;

import java.util.Scanner;

public class PowerOfANumberwithoutMethod2223 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base value:");
		int base=sc.nextInt();
		System.out.println("Enter Expotent value:");
		int expo=sc.nextInt();
				long result=1;
		for(int i=1;i<=expo;i++)
		{
			result*=base;
			
		}
		System.out.println(expo+" power of "+base+" is equals to "+result);
	sc.close();	
	}

}
