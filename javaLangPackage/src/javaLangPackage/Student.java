package javaLangPackage;

public class Student {
	int sno;
	String sname;
	

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
System.out.println(s);
System.out.println(s.getClass());
System.out.println(s.getClass().getName());
	}

}
