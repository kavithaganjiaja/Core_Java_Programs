package EmployeeManagementSystem;

abstract class Employee {
	int EmpId;
	String EmpName;
	double salary;
	abstract void calculateBonus(double salary);
	public void displayEmpDetails(int EmpId,String EmpName) {
		System.out.println("Employee ID:"+EmpId);
		System.out.println("Employee Name:"+EmpName);
		
		
		
	}

}
