package day33_methods05;

public class AgeCalculator {
	
	public static void main (String[] args) {
		System.out.println("You are " + calculateAge(1944) + " years old");
	}

	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		
		if (age>1 && age <14) {
			System.out.println("Child");
		}else if (age > 15 && age <25) {
			System.out.println("Youngster ");
		}else if (age >26 && age < 65) {
			System.out.println("Adult ");
		}else if (age > 65) {
			System.out.println("Senior ");
		}else if (age <=0) {
			System.out.println("Invalid age ");
			return 0;
		}
		return age;
		
	}
}
