package fundamentals;

public class Task6Product {
	int productID=1111;
	String productName="Laptop";
	float price=70000;
	
	void calculateDiscount(int discountPercent)
	{
		double discountAmount=(price*discountPercent)/100;
		double discountedPrice=price-discountAmount;
		System.out.println("Discount Amount:"+discountAmount);
		System.out.println("Final Cost:"+discountedPrice);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task6Product tp=new Task6Product();
		System.out.println("Product ID: "+tp.productID);
		System.out.println("Product Name: "+tp.productName);
		System.out.println("Product Price: "+tp.price);
		tp.calculateDiscount(10);
	
		
		
	}

}
