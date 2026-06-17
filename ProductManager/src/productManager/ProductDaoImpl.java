package productManager;

import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {
Scanner sc=new Scanner(System.in);
Product[] addProducts=new Product[2];

	@Override
	public void addProducts() {
		for(int i=0;i<2;i++) {
			System.out.println("Enter product ID:");
			int pid=sc.nextInt();
			System.out.println("Enter product Name:");
			String pname=sc.next();
			System.out.println("Enter product quanty:");
			int qty=sc.nextInt();
			System.out.println("Enter product price:");
			double price=sc.nextDouble();
			Product products=new Product(pid,pname,qty,price);
			addProducts[i]=products;
			System.out.println("added successfully!!");
			
			
		}//end of for

	}

	@Override
	public Product[] viewAllProducts() {
		// TODO Auto-generated method stub
		return addProducts;
	}

}
