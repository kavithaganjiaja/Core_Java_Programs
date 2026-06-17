package fundamentals;

public class Task7CollegeStudent {
	
	int studentId;
	String studentName;
	static String collegeName="SVM";
	void display(int id,String name) {
		studentId=id;
		studentName=name;
		System.out.println("Student ID:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("College Name:"+collegeName+"\n");
	}
	
		
	public static void main(String[] args) {
		
		Task7CollegeStudent cs=new Task7CollegeStudent();
		cs.display(111, "ramu");
		cs.display(222, "laxman");

	}

}
