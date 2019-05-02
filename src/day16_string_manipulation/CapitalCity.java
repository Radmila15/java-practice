package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Baku, Azerbaijan
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email = "radmila_15@gmail.com";
		String company = "apple";
		String newEmail = email.replace("gmail", "apple");
		System.out.println(newEmail);
		

	}

}
