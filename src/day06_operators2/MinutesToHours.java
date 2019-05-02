package day06_operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		int minutes = 310;
		int hours = minutes / 60;
		int remainigMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainigMinutes);
		
		System.out.println(hours+ " hours and " + remainigMinutes+ " minutes");
	}

}
