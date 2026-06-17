package fundamentals;

public class Task13StudentMarksAverage {
	String studentName;
	int sub1_Marks;
	int sub2_Marks;
	int sub3_Marks;	
	void calculateAverage(String name,int m1,int m2,int m3) {
		studentName=name;
		sub1_Marks=m1;
		sub2_Marks=m2;
		sub3_Marks=m3;
		int avg=(sub1_Marks+sub2_Marks+sub3_Marks)/3;
		System.out.println("Student Name:"+studentName);
		System.out.println("Subject1 Marks:"+sub1_Marks);
		System.out.println("Subject2 Marks:"+sub2_Marks);
		System.out.println("Subject3 Marks:"+sub3_Marks);
		System.out.println("Total Marks:"+(sub1_Marks+sub2_Marks+sub3_Marks));
		System.out.println("Average Marks:"+avg);
		System.out.println("--------------------");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task13StudentMarksAverage sma=new Task13StudentMarksAverage();
		sma.calculateAverage("kavitha",80,89,88);
		sma.calculateAverage("Veda",90,95,78);
		sma.calculateAverage("aadhya",95,99,85);
		
		
	}

}
