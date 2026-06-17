package ForLoopAssignments;

import java.util.Scanner;

public class PrintAllPerfectNumber16 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Upto which number do you want to print:");
	int n=sc.nextInt();
	
	int i;
	System.out.println("Perfect Numbers between 1 to "+n);
	//sum=sum+i;
	for(int num=1;num<=n;num++) {
		int sum=0;
	for(i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			//System.out.print(+i+" ");
			sum=sum+i;
		}
	}
	
	if(sum==num && num>0)
	System.out.println(num);
	
	}
sc.close();
}
}