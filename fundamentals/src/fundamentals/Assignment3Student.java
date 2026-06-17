package fundamentals;

public class Assignment3Student {
	static String schoolName="Sri Prathibha High School";
	public void display()
	{
		System.out.println(schoolName);
	}

	public static void main(String[] args) {
	
		//Assignment3Student st=new Assignment3Student();

		
		//Assignment3Student st1=null;
	
		
		//Assignment3Student st2=new Assignment3Student();
		//st2.display();
		
		//System.out.println("School Name:"+st.schoolName);
		
		//System.out.println("School Name:"+schoolName);
		
		//This is the best approach(with class name) to access the static variables
		System.out.println("School Name:"+Assignment3Student.schoolName);
		
		//System.out.println("School Name:"+st1.schoolName);
	}

}
