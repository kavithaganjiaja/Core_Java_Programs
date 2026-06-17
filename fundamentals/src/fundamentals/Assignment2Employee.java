package fundamentals;

public class Assignment2Employee {
	
	public void displayDetails(int empID,long salary,String name)
	{
		System.out.println("Employee ID:\t"+empID);
		System.out.println("EmployeeName:\t"+name);
		System.out.println("Salary:\t\t"+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Employee emp=new Assignment2Employee();
		emp.displayDetails(12346,100000,"Manoj");
	}

}
