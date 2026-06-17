package employeeSalaryManagementSystem;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee d=new Developer();
		d.salary();
		Employee t=new Tester();
		t.salary();
		Employee m=new Manager();
		m.salary();
		

	}

}
