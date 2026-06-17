package access_specifiers;


class Car{
	String model;
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
c.model="TATA"; // accessible within the same package 
System.out.println(c.model);
	}

}
