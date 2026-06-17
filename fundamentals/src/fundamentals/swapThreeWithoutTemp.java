package fundamentals;

public class swapThreeWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200,c=300;
		System.out.println("Before Swapping: a="+a+"\t b="+b+"\t c="+c);
		a=a+b+c;//a=600
		b=a-(b+c);//600-500=100
		c=a-(b+c);//600-400=200
		a=a-(b+c);//600-300=300
		System.out.println("After Swapping: a="+a+"\t b="+b+"\t c="+c);
		
	}

}
