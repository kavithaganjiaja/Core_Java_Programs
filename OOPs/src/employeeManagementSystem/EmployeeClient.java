package employeeManagementSystem;

public class EmployeeClient {

	public static void main(String[] args) {
		Developer d=new Developer();
		d.setEmpID(111);
		d.setEmpName("anitha");
		d.setEmpEmail("anitha@gmail.com");
		d.setEmpAddress("Nalgonda");
		d.setProgrammingLang("java");
		d.salary(100000);
		System.out.println(d.getEmpID()+"\t"+d.getEmpName()+"\t"+d.getEmpAddress()+"\t"+d.getEmpEmail()+"\t\t"+d.getProgrammingLang()+"\t"+d.getEmpSalary());
		Manager m=new Manager();
		m.setTeamSize(10);
		System.out.println("team size:"+m.getTeamSize());
	}

}
