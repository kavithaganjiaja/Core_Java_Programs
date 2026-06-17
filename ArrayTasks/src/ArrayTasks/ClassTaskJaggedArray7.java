package ArrayTasks;

import java.util.Scanner;

public class ClassTaskJaggedArray7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		System.out.println("Enter column size:");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("enter "+(i+1)+" row elements:");
			
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
		
		System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
