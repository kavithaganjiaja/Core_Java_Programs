package fundamentals;

public class StudentMngmntSystem {
	int studentId=111;
	String sname="kavitha";
	int marks=530;
	int perc=(marks/600)*100;
	
	public void grade()
	{
	
	if(perc>=80) {
		System.out.println("GRade: A");
	}else if(perc<80 && perc>=70) {
		System.out.println("Grade: B");
	}else if(perc<70 && perc>=65) {
		System.out.println("Grade: C");
	}else if(perc<65 && perc>=40) {
		System.out.println("Grade: D");
	}
	else {
		System.out.println("Grade: F");
	}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMngmntSystem student=new StudentMngmntSystem();
		System.out.println("StudentID: "+student.studentId);
		System.out.println("StudentName: "+student.sname);
		System.out.println("Marks: "+student.marks);
		student.grade();
		
		

	}

}
