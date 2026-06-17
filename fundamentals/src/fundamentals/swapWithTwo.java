package fundamentals;

public class swapWithTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fn=100;int sn=200;
		System.out.println("Before swapping: fno:");
		System.out.println("fno:"+fn+"\t"+"sno:"+sn);
		//swapping
		int temp=0;
		temp=fn;
		fn=sn;
		sn=temp;
		System.out.println("After swapping:");
		System.out.println("Fno:"+fn+"\t"+"sno"+sn);
				
	}

}
