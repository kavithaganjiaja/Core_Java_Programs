package fundamentals;

public class swapTwoWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200;
		System.out.println("Before Swapping: a="+a+"\t b="+b);
		a=a+b;//a=300
		b=a-b;//a=300-100=>b=200
		a=a-b;//300-200=>a=100
		System.out.println("After Swapping: a="+a+"\t b="+b);
				

	}

}
