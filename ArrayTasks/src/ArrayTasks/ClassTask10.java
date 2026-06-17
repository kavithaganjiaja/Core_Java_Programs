package ArrayTasks;

import java.util.Scanner;

public class ClassTask10 {

	public static void main(String[] args) {
		int ar[]= new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("The Given Array is:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
sc.close();
	}

}
