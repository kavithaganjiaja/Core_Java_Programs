package ArrayTasks;

import java.util.Arrays;

public class SortOfElements24Ascending {
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
		// TODO Auto-generated method stub
		int[] arr= {3,7,5,9,2};
		sort(arr);
		System.out.println("Ascending Order: " + Arrays.toString(arr));
		
	}

}
