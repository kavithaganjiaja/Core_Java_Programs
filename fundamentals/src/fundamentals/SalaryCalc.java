package fundamentals;

public class SalaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long BasicSalary=85000;
		long TA=(BasicSalary*15)/100;
		long DA=(BasicSalary*20)/100;
		long HRA=(BasicSalary*18)/100;
		long PF=(BasicSalary*20)/100;
		long Tax=(BasicSalary*25)/100;
		long GrossAmt=BasicSalary+TA+DA+HRA;
		long NetAmt=GrossAmt-(PF+Tax);
		System.out.println("Gross salary: "+GrossAmt);
		System.out.println("Net Salary: "+NetAmt );
		
	}

}
