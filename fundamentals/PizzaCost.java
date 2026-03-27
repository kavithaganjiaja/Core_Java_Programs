package fundamentals;

public class PizzaCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfPizza=2;
		double costOfPizaa=399;
		double discount=20;
		double IntialCost=costOfPizaa*noOfPizza;
		double BillAmount=IntialCost+((IntialCost*discount)/100);
		System.out.println("Bill Amount:"+BillAmount);
	}

}
