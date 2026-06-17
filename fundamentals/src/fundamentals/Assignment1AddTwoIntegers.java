package fundamentals;

public class Assignment1AddTwoIntegers {
	int sum(int a,int b)
	{
		
		int add=a+b;
		return add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1AddTwoIntegers addition=new Assignment1AddTwoIntegers();
		int result=addition.sum(10,20);
		System.out.println("Addition of given numbers is : "+result);
		
		
	}

}
