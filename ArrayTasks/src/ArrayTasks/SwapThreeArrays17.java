package ArrayTasks;

import java.util.Arrays;

public class SwapThreeArrays17 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		int[] arr3= {11,12,13,14,15};
		System.out.println("Before Swapping:");
		System.out.println("Array1:"+Arrays.toString(arr1));
		System.out.println("Array2:"+Arrays.toString(arr2));
		System.out.println("Array3:"+Arrays.toString(arr3));
		for(int i=0;i<arr1.length;i++) {
			int temp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=arr3[i];
			arr3[i]=temp;
		}
		System.out.println("After Swapping:");
		System.out.println("Array1:"+Arrays.toString(arr1));
		System.out.println("Array2:"+Arrays.toString(arr2));
		System.out.println("Array3:"+Arrays.toString(arr3));
			
	}

}
