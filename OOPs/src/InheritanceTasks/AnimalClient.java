package InheritanceTasks;

public class AnimalClient {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		System.out.println("-----------------");
		Puppy p=new Puppy();
		p.eat();
		p.weeping();
		p.bark();
		System.out.println("-----------------");
		Cat c=new Cat();
		c.eat();
		c.meow();
	}

}
