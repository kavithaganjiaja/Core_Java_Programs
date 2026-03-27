package fundamentals;

public class swapFourWihtoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200,c=300,d=400;
		System.out.println("Before Swapping: a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
		a=a+b+c+d;//a=1000
		b=a-(b+c+d);//1000-900=100
		c=a-(b+c+d);//1000-800=200
		d=a-(b+c+d);//1000-700=300
		a=a-(b+c+d);//1000-600=400
		System.out.println("After Swapping: a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}

}
