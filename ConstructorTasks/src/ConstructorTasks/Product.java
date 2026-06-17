package ConstructorTasks;

public class Product {
	int pno;
	String pname;
	

	public int getPno() {
		return pno;
	}


	public void setPno(int pno) {
		this.pno = pno;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setPno(122);
		p.setPname("ramu");
		System.out.println(p.pno+"\t"+p.pname);
		
	}

}
