package ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class AnyLargestNumber14 {
	public static void sort(int[] ar)
	{
		int n=ar.length;
		for(int i=0;i<n-1;i++)
		{
			boolean isSwap=false;
			for(int j=0;j<n-i-1;j++) {
			if(ar[j]>ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				isSwap=true;
			}
			}
			if(!isSwap)
			{
			break;
			}
			
			
		}
	}
	public static void main(String[] args) {
		int[] arr= {35,7,15,29,2};
		sort(arr);
		Scanner sc=new Scanner(System.in);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("which largest number do you want?");
		int n=sc.nextInt();
		
		
		int largestNum=arr[arr.length-n];
		System.out.println(largestNum);
		
		sc.close();
	}

}
