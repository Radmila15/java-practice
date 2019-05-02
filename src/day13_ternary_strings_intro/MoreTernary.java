package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		
//	1	String quality = "bad";
//		int rating = (quality.equals("good")) ? 100 : 0;
//		System.out.println("Rating: " + rating);
//		
		
//	2	int PMHour = 6;
//		//Rush hour during evening: 4 - 7
//		boolean rushHour = (PMHour >= 4 && PMHour <= 7) ? true : false; 
//	    System.out.println(PMHour + " is rush hour? " + rushHour);
		
// 3	String result = rushHour == true ? "yes" : "no";
//		System.out.println(PMHour + " is rush hour? " + rushHour);
		
		int AMHour = 10; //6-9
		// 6-9 amRushHour - Yes, No
		String amRushHour = AMHour >= 6 && AMHour <= 9? "Yes" : "No";
		
		System.out.println(AMHour + " is rush hour? " + amRushHour);

	}

}
