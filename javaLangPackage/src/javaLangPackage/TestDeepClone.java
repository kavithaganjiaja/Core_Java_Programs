package javaLangPackage;

public class TestDeepClone implements Cloneable{
	int i=100;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		TestDeepClone t=new TestDeepClone();
Object obj=t.clone();//DeepCloning
TestDeepClone t1=(TestDeepClone)obj;
System.out.println(t.i+"\t"+t1.i);
t1.i=1000;
System.out.println(t.i+"\t"+t1.i);
TestDeepClone t2=t;//shallow cloning
System.out.println(t.i+"\t"+t1.i+"\t"+t2.i);
	}

}
