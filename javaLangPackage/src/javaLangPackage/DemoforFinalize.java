package javaLangPackage;

public class DemoforFinalize {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("it will clean the memory");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoforFinalize d=new DemoforFinalize();
		d=null;
		System.gc();
	}

}
