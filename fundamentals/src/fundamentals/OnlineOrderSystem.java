package fundamentals;

public class OnlineOrderSystem {
	String customerName;
	int customerId;
	String items;
	int totalPrice;

	void customer(String name, int id) {
		customerName = name;
		customerId = id;
		// System.out.println("Customer NAme:"+customerName);
		// System.out.println("CustomerId:"+customerId);

	}

	void addItems(String item) {
		items = item;
		// System.out.println("Item:"+item);
	}

	void calculateTotal(int price) {
		totalPrice = price;
		// System.out.println("total price:"+price);

	}

	void displayOrder() {
		System.out.println("Customer NAme:" + customerName);
		System.out.println("CustomerId:" + customerId);
		System.out.println("Item:" + items);
		System.out.println("total price:" + totalPrice);
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		OnlineOrderSystem oos = new OnlineOrderSystem();
		oos.customer("kavitha", 111);
		oos.addItems("cup");
		oos.calculateTotal(100);
		oos.displayOrder();
		
		oos.customer("Manoj", 222);
		oos.addItems("laptop");
		oos.calculateTotal(25000);
		oos.displayOrder();

	}

}
