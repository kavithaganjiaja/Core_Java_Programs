package ForLoopAssignments;

import java.util.Scanner;

public class StrongNumber17 {

	public static void main(String[] args) {
		// a strong number is a number whose value equals the sum of the factorials of its digits. 
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a number:");
		int n=sc.nextInt();
		int sum=0,m=n;
		StrongNumber17 s=new StrongNumber17();
		while(n!=0)
		{
			int temp=n%10;
			int f=1;
			n=n/10;
			for(int j=1;j<=temp;j++)
			{
				f=f*j;
				
			}
			sum=sum+f;
			
		}
		if(sum==m) {
			System.out.println(+m+" is a Strong Number.");
		}
			else {
			System.out.println(+m+" is not a Strong Number.");
			}
		
		sc.close();
	}

}
