package abstractionTasks;
abstract class Bank{
	abstract int getRateOfInterest();
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 10;
	}
	
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 11;
	}
	
}

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AXIS a=new AXIS();
	//	System.out.println("AXIS interest rate:"+a.getRateOfInterest());
		System.out.println("AXIS interest rate:"+new AXIS().getRateOfInterest()); //instead of above two lines
		
		Bank i=new ICICI();			//dynamic polymorphism
		System.out.println("ICICI interest rate:"+i.getRateOfInterest());
		
		

	}

}
