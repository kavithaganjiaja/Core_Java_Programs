package ArrayTasks;

import java.util.Arrays;

public class CopyingElements18 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= new int[arr1.length];
		
		System.out.println("Before Copying:");
		System.out.println("Array1:"+Arrays.toString(arr1));
		System.out.println("Array2:"+Arrays.toString(arr2));
		
		for(int i=0;i<arr1.length;i++) {
		
			arr2[i]=arr1[i];
		}
		
		System.out.println("\nCoppied elements into Array2:");
		
		System.out.println("Array2:"+Arrays.toString(arr2));
			
	}

}
