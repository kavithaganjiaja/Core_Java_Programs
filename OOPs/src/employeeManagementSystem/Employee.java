package employeeManagementSystem;

public class Employee {
	private int empID;
	private String empName;
	private String empAddress;
	private String empEmail;
	private long empSalary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void salary(long empSalary) {
		if(empSalary>0) {
		this.empSalary += empSalary;
		//System.out.println("Salary: "+empSalary);
		}
		else
		{
			System.out.println("Invalid salary!!!");
		}
	}
	
}
