package day55_abstraction;

public abstract class Animal {
	
	//private String name;
	public Dog (String name) {
		this.name  = name;
	}
	
	public abstract void speak(); //create abstract method // so we cannot have abstract methods in regular class

	public abstract void eat();
	//dog: woof woof
	//cat speaks: meow
	//pig speaks: oink oink
	public String getName() {
		return getName();
	}
}
