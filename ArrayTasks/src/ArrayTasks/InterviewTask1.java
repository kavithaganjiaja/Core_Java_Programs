package ArrayTasks;

import java.util.Arrays;

public class InterviewTask1 {

	public static void main(String[] args) {
		int[] arr={-1, 2, -3, 5,-6};
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		System.out.print(Arrays.toString(arr1));
	}

}
