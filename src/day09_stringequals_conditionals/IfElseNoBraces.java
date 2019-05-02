package day09_stringequals_conditionals;

public class IfElseNoBraces {

	public static void main(String[] args) {
		String day = "Tuesday";
		
		if(day.equals("Tueday")) //we can remove{}
			System.out.println("Today is Tuesday");
		
		else
			System.out.println("Today is not Tuesday");
		    System.out.println("Tuesday is not today");//this line is not part of ELSE block because after else it will read only the first Sysout
	}

}
