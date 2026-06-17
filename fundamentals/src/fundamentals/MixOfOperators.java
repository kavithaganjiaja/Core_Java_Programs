package fundamentals;

public class MixOfOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		if((a+b>c)&&(b!=0)) //30>30->false && true = false
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//String msg=((a+b>c)&&(b!=0))?"true":"false";
		//System.out.println(msg);
	}

}
