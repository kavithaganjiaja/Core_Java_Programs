package fundamentals;

public class swapWithThree 
{
	public static void main(String[] args)
	{
		int fno=100;int sno=200,tno=300;
		System.out.println("Before swapping:");
		System.out.println("fno:"+fno+"\t"+"sno:"+sno+"\t"+tno);
		//swapping
		int temp=0;
		temp=fno;
		fno=sno;
		sno=tno;
		tno=temp;
		System.out.println("After swapping:");
		System.out.println("Fno:"+fno+"\n"+"sno:"+sno+"\n"+"tno:"+tno);
	}
}
