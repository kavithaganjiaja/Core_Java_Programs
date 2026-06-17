package productManager;

public class ProductClient {

	public static void main(String[] args) {
		ProductDaoImpl daoImpl=new ProductDaoImpl();
		daoImpl.addProducts();
		Product[] viewAllProducts=daoImpl.viewAllProducts();
		for(Product p:viewAllProducts) {
			System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getQty()+"\t"+p.getPrice());
		}

	}

}
