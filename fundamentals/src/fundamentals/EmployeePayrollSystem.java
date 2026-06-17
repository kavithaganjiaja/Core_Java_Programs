package fundamentals;

public class EmployeePayrollSystem {
	String empName = "Kavitha";
	long msalary = 100000;
	long salary = msalary * 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeePayrollSystem eps = new EmployeePayrollSystem();
		System.out.println("Employee Name:" + eps.empName);
		System.out.println("Monthly Salary:" + eps.msalary);
		System.out.println("Yearly Salary:" + eps.salary);
	}

}
