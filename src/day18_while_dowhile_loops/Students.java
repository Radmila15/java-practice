package day18_while_dowhile_loops;

public class Students {

	public static void main(String[] args) {

		// using loop, iterate until we have 10 students in the room
		// student 1
		// student 2

		int numberOfStudents = 1;

		while (numberOfStudents <= 10) {// or numberOfStudents <11
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;

		}

		System.out.println("No more space!");
	}

}
