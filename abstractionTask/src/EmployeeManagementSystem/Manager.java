package EmployeeManagementSystem;

public class Manager extends Employee {

	@Override
	void calculateBonus(double salary) {
		System.out.println("Employee Salary:"+salary);
		double bonus=(salary*20)/100;
		System.out.println("Bonus is "+bonus);
	}

}
