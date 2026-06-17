package fundamentals;

public class EcommerceCartSystem {
	String productName = "TV";
	int price = 100000;
	int qty = 1;
	int billAmount = price * qty;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommerceCartSystem ecs = new EcommerceCartSystem();
		System.out.println("ProductName:" + ecs.productName);
		System.out.println("Price:" + ecs.price);
		System.out.println("quantity:" + ecs.qty);
		System.out.println("Bill Amount:" + ecs.billAmount);

	}

}
