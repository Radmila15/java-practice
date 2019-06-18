package day56_abstraction02;

public abstract class Browser {
	
	
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	public void close() {
		System.out.println("Exitting the Browser");
	}

}
