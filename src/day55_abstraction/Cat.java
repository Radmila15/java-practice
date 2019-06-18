package day55_abstraction;

public class Cat extends Mammal{

	@Override
	public void speak() {
		System.out.println("meooooooow");
		
	}
	@Override
	public void eat() {
		System.out.println(getName() + "eats");
	}
}
