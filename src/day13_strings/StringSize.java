package day13_strings;

public class StringSize {

	public static void main(String[] args) {

		String str1 = "Good Morning";
		
		if (str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not match - ignore case");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1);//it stays as old value. not uppercase
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);
		
		//combine the above methods together:
		//convert to all lowercase first then check if it equals("good morning")
		
		        //good morning====> good morning
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		
		//find out how many characters in the string
		String myName = "Radmila";
		
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length:" + length);
		
		//usernames must be exactly 8 characters.
		//set some value and using a if statement check it is
		//8 characters: if true => valid username. false => invalid username
		//must be 8 chars
		
		String userName = "password";
		if(userName.length() == 8) {
			System.out.println("Valid username");
		}else {
			System.out.println("InValid username");
		}
		
		//password must be at least 6 characters
				
		
		
		
		
		
		
		
		
		
		
	}

}
