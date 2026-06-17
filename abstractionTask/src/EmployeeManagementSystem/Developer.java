package EmployeeManagementSystem;

public class Developer extends Employee {

	@Override
	void calculateBonus(double salary) {
		System.out.println("Employee Salary:"+salary);
		double bonus=(salary*10)/100;
		System.out.println("Bonus is "+bonus);
	}

}
