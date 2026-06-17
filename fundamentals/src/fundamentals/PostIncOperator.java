package fundamentals;

public class PostIncOperator {

	public static void main(String[] args) {
		int x=10;
		int y=x++;
		System.out.println(+x+"\t"+y);
		System.out.println(x++ + y++);
		System.out.println(+x+"\t"+y);
		System.out.println(x+y);

	}

}
