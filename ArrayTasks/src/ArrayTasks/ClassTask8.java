package ArrayTasks;

import java.util.Scanner;

public class ClassTask8 {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+" row elements:");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
