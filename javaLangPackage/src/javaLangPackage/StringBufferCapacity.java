package javaLangPackage;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijlkmnop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//(16+1)*2=34
		StringBuffer sb1=new StringBuffer("siva");
		System.out.println(sb1.capacity());//16+4=20
		sb1.append("abcdefghijlkmnopqrstuvwx");//24=>exceeds 20 then capacity 20+1)*2
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(0));//s
		System.out.println(sb1.length());
		System.out.println(sb1.insert(0, "rani"));
		System.out.println(sb1.delete(0, 4));
		System.out.println(sb1.deleteCharAt(sb1.length()-1));
		System.out.println(sb1.replace(0, 4, "VEDA"));
		sb1.ensureCapacity(1000);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		System.out.println(sb1.substring(4));
		System.out.println(sb1.substring(0, 4));
		System.out.println(sb1);
		
		

	}

}
