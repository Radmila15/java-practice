import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Enter your code here
    
    String subject1, subject2, subject3, subject4, summary;
    float grade1, grade2, grade3, grade4, average;
    
    
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to the Grader!");
     
 
 System.out.println("Please enter subject name number 1 and score for this subject");
 subject1 = input.next();
 grade1 = input.nextFloat();

System.out.println("Please enter subject name number 2 and score for this subject");
 subject2 = input.next();
 grade2 = input.nextFloat();

System.out.println("Please enter subjrct name number 3 and score for this subject");
 subject3 = input.next();
 grade3 = input.nextFloat();


System.out.println("Please enter subject name number 4 and score for this subject ");
subject4 = input.next();
 grade4 = input.nextFloat();

summary = subject1 + "-" + grade1 + "," + subject2 + "-" + grade2 + "," + subject3 + "-" + grade3 + "," + subject4 + "-" + grade4;
System.out.println("Summary :" + summary);
average = (grade1 + grade2 + grade3 + grade4) / 4; 
System.out.println("Your average score is : " + average);

System.out.println("Thank you for using Grader!");
System.out.println("Goodbye!");



 