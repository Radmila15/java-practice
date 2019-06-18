package day47_blocks;

public class AllBlocks {
	static {
		System.out.println("static block - I run first and only once");
	}
	{
		System.out.println("INIT BLOCK - I run each time object is created. Before constructor");
	}
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created.");
	}
 
}