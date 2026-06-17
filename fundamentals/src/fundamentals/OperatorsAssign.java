package fundamentals;

public class OperatorsAssign {
	void addition(int a,int b)
	{
		System.out.println("Arithmetic Operators:");
	int c=a+b;
	System.out.println("Addition: "+c);
	}
	void substraction(int a,int b)
	{
	int c=a-b;
	System.out.println("Substraction: "+c);
	}
	void multiplication(int a,int b)
	{
	int c=a*b;
	System.out.println("Multiplication: "+c);
	}
	void division(int a,int b)
	{
	float c=a/b;
	System.out.println("division: "+c);
	}
	void modulus(int a,int b)
	{
	int c=a%b;
	System.out.println("Remainder: "+c);
	}
	void incOrDec(int n)
	{
		System.out.println("Inc/Dec Operators:\nOriginal value of n: "+n);
		++n;
		System.out.println("++n:" +n);
		--n;
		System.out.println("--n: "+n);
		n--;
		System.out.println("n--: "+n);
		n++;
		System.out.println("n++: "+n);
	}
	void AssignOperators(int x)
	{
		System.out.println("Compound Assignment Operators:\nOriginal value of n: "+x);
		x+=2;//x=x+2
		System.out.println("x+=2: "+x);
		x-=3;//x=x-3
		System.out.println("x-=3: "+x);
		x*=10;//x=x*10
		System.out.println("x*=10: "+x);
		x/=10;//x=x/10;
		System.out.println("x/=10: "+x);
		x%=9;//x=x%9
		System.out.println("x/=9: "+x);
		System.out.println("--------------------");
	}
	

	public static void main(String[] args) {
		
		OperatorsAssign Op=new OperatorsAssign();
		Op.addition(10,20);
		Op.substraction(10,50);
		Op.multiplication(10, 30);
		Op.division(200,5);
		Op.modulus(102,10);
		System.out.println("---------------");
		Op.incOrDec(7);
		System.out.println("---------------");
		Op.AssignOperators(20);
		
	}

}
