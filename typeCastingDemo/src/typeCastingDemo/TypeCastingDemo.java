package typeCastingDemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=25;
		int i=b;//implicit casting/Widening/Upcating/Automatic casting ot converstion
		System.out.println("Implicit:"+i);
		int g=2567;
		short s= (short)g;//Explicit or Narrowing or downcasting or Manual
		System.out.println("Explicit:"+s);
		System.out.println("Automatic PType Promotion:"+('A'+'B'));//BCZ Of automatic type promotion
																//it calculates the AscII values
		System.out.println('A'+5+879657);
	}

}
