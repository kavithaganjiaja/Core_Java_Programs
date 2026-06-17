package ArrayTasks;

import java.util.Arrays;

public class SecondSmallestNumber12 {
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
		System.out.println("Sorted array: " + Arrays.toString(arr));
		int secondSmallNum=arr[1];
		System.out.println(secondSmallNum);
	}

}
