package day47_blocks;

public class VariableAccess {
	//instance variable
	int myInstanceVar = 40; //if you wanna access instance variable, create object

	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		
		//System.out.println(myInstanceVar); 
		//cannot access non-static from static method

		System.out.println(myStaticVariable); //it is working
		
		//create object of VariableAccess and print myInstanceVar
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVar);
		//access static variable using object
		System.out.println(v.myStaticVariable);
		//access static variable using classname
		System.out.println(VariableAccess.myStaticVariable);
		
		
	}

}
