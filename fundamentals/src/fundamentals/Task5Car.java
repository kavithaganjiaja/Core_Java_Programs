package fundamentals;

public class Task5Car {
	String model;
	float price;
	static int carCount=0;
	
	void car(String mdl,float pr)
	{
		model=mdl;
		price=pr;
		System.out.println("CAR:"+model);
		System.out.println("Price: "+price);
		carCount++;
		
	}


	public static void main(String[] args) {
		
		Task5Car tc=new Task5Car();
		tc.car("Vitara", 1000000);
		tc.car("Nexon", 1500000);
		tc.car("Shift", 500000);
		System.out.println("No.of Cars:"+carCount);
	}

}
