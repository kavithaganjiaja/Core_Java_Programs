package javaLangPackage;

public class ToStringDemo {
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringDemo t=new ToStringDemo();
		System.out.println(t);//ToStringDemo@54bedef
		System.out.println(t.hashCode());//1421795058-hashCode() returns a unique value for object
		System.out.println(Integer.toHexString(1421795058));//54bedef2
		ToStringDemo t1=new ToStringDemo();
		System.out.println(t1.hashCode());//1555009629-hashCode() returns a unique value for every object
	}

}
