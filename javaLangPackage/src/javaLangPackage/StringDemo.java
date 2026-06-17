package javaLangPackage;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="KavithaGanji";
		char[] charArry=str.toCharArray();
		for(char c:charArry)
		System.out.println(c);
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,9));
		System.out.println(str.replace("Kavitha", "anitha"));
		System.out.println(str.replace("a", "A"));
		System.out.println(str.replaceAll("a", "A"));
		
		
	}

}
