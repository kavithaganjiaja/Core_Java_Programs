package EmployeeManagementSystem;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		System.out.println("Developer:");
		d.displayEmpDetails(231456, "Ramu");
		d.calculateBonus(100000);
		System.out.println("-----------------");
		Manager m=new Manager();
		System.out.println("Manager:");
		m.displayEmpDetails(236451, "Laxman");
		m.calculateBonus(150000);
		System.out.println("-----------------");
		Tester t=new Tester();
		System.out.println("Tester:");
		t.displayEmpDetails(274351, "Sita");
		t.calculateBonus(95000);
		

	}

}
