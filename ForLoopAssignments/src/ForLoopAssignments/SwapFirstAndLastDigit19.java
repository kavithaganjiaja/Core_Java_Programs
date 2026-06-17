package ForLoopAssignments;

import java.util.Scanner;

public class SwapFirstAndLastDigit19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n!=0)
		{
			int l=String.valueOf(n).length();
			String firstDigit = String.valueOf(n).substring(0, 1);
			String midPart = String.valueOf(n).substring(1, l-1);
			int LastDigit=n%10;
			System.out.println(LastDigit+midPart+firstDigit);
			
		}
		/*String str=Integer.toString(n);
		int l=String.valueOf(n).length();
		String ld=null,fd=null,midStr=null;
		for(int i=0;i<=l;i++)
		{
			int m=i;
			if(i==0)
			{
				ld=str.substring(l-1,1);
			}
			else if(i==l-1) {
				fd=str.substring(0,1);
			}else {
			
				String s=Integer.toString(m);
				midStr=s.substring(1,l-2);
			}
			System.out.println(ld+midStr+fd);
		}*/
		
			
sc.close();
	}

}
