package ConstructorTasks;

public class ThisDemo {
	int i=100;
	 int j=10;
	void display(int i) {
		System.out.println("Before this:"+i+"\t"+j);
		System.out.println("After this:"+this.i+"\t"+this.j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo t=new ThisDemo();
t.display(333);
	}

}
