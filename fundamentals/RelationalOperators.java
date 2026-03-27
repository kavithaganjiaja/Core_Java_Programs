package fundamentals;

public class RelationalOperators {
	void RelOperators(int a,int b)
	{
		System.out.println("Relational Operators: \n a value is: "+a+"\tb value is: "+b);
		
		if(a==b)
		{
			System.out.println(+a+"=="+b+" is true");
		}
			else 
				{
				System.out.println(+a+"=="+b+" is false");
				}
		if(a!=b)
		{
			System.out.println(+a+"!="+b+" is true");
		}
		else
		{
			System.out.println(+a+"!="+b+" is false");
		}
		if(a>b)
		{
			System.out.println(+a+" is greater than "+b);
		}
		else
		{
			System.out.println(+a+" is not greater than "+b);
		}
		if(a<b)
			{
				System.out.println(+a+" is Lesser than "+b);
		}
		else
		{
			System.out.println(+a+" is not Lesser than "+b);
		}
			if(a>=b)
			{
				System.out.println(+a+" is greater than or equals to "+b);
		}
			else
			{
				System.out.println(+a+">="+b+" is false");
			}
			if(a<=b)
			{
				System.out.println(+a+" is lesser than equals to "+b);
		}
			else
			{
				System.out.println(+a+"<="+b+" is false");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperators rlop=new RelationalOperators();
		
		rlop.RelOperators(30,40);

	}

}
