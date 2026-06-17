package fundamentals;

public class Task10EmployeeSalaryTracker {
	String empName;
	int empId;
	long salary;
	static int totalEmployees;
	void employees(int id,String name,long sal)
	{
		empName=name;
		empId=id;
		salary=sal;
		System.out.println("Employee:"+empName);
		System.out.println("ID:"+empId);
		System.out.println("Salary"+salary+"PM");
		totalEmployees++;
		System.out.println("******************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task10EmployeeSalaryTracker est=new Task10EmployeeSalaryTracker();
		est.employees(111, "kavitha", 50000l);
		est.employees(222,"aadhya",80000l);
		est.employees(333,"Veda",55000l);
		est.employees(444,"Manohar",60000l);
		est.employees(555,"ramu",75000l);
		System.out.println("Total Employees:"+totalEmployees);
				

	}

}
