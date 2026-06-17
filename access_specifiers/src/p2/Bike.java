package p2;

import p1.Vehicle;

public class Bike extends Vehicle{
	void showSpeed() {
		speed=100;// allowed: subclass in different package

		System.out.println(speed);
	}

}
