package fundamentals;

public class Task11Circle {
	
	float pi = 3.14159f;

	void printArea(int radius) {
		float area = pi * radius * radius;
		System.out.println("Circle Area is: " + area);

	}

	void printCircumference(int radius) {
		float perimeter = 2*pi * radius;
		System.out.println("Circle Perimeter is: " + perimeter);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task11Circle c = new Task11Circle();
		c.printArea(5);
		c.printCircumference(5);
	}

}
