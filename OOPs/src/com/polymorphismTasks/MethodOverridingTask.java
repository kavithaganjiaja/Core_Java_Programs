package com.polymorphismTasks;
class Animal{
	public void sound() {
		System.out.println("Every Animal has a sound");
	}
	public void type() {
		System.out.println("Animals are two types ");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog is barking");
	}
	
}
class Cat extends Animal{
	public void sound() {
		super.sound();
		super.type();
		System.out.println("Cat sounds like meow");
	}
	
}


public class MethodOverridingTask {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.sound();
		

	}

}
