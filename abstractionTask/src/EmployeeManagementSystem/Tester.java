package EmployeeManagementSystem;

public class Tester extends Employee {

	@Override
	void calculateBonus(double salary) {
		System.out.println("Employee Salary:"+salary);
		double bonus=(salary*5)/100;
		System.out.println("Bonus is "+bonus);
	}

}
