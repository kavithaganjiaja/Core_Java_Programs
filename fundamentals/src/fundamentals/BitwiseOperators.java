package fundamentals;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Bitwise AND:");//In this case:If first condition is false , don't check second one
		System.out.println(a<b&++a>b);
		System.out.println(a);
		System.out.println(a>b&++a>b);
		System.out.println(a);
		System.out.println("-----------------");
		System.out.println("Bitwise OR:");//In this case:Even first condition is false also, it checks second one
		System.out.println(a<b|++a>b);
		System.out.println(a);
		System.out.println(a>b|++a>b);
		System.out.println(a);
		System.out.println("-----------------");
		System.out.println("Bitwise Left Shift:");
		System.out.println(10<<3);//10*2*2*2
		System.out.println("-------------");
		System.out.println("Bitwise Right Shift:");
		System.out.println(10>>2);//10/(2*2)
		System.out.println("---------------------");
		
		

	}

}
