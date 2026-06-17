package access_specifiers;

class Person {
	public String name="anitha";
	private int age=30;
	

}
public class PrivateDemo{

	public static void main(String[] args) {
		Person p=new Person();
		
	System.out.println(p.name); 
	//System.out.println(p.age); error: age is private variable
	}

}
