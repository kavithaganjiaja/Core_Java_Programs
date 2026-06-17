package ArrayTasks;

import java.util.Scanner;

public class AverageValueOfArray1 {
	void average(int ar[])
	{
		int sum=0,avg;
		for(int m=0;m<ar.length;m++)
		{
			sum+=ar[m];
		}
		
		avg=sum/ar.length;
		System.out.println("Average Value is "+avg);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AverageValueOfArray1 a=new AverageValueOfArray1();
		System.out.println("Enter the array size:");
		int arrSize=sc.nextInt(); 
		int arr[]=new int[arrSize];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		a.average(arr);
			
		
		
		sc.close();

	}

}
