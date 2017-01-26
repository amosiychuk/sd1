import java.util.Scanner;

public class Calcgrade {
  public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt for the relavent percentages
    System.out.println("Please enter the following as percentage ...");
    //Prompt for midterm     
    System.out.print("midterm exam: ");
    double midtermexam = input.nextDouble();
	//Prompt for final exam
    System.out.print("final exam: ");
    double finalexam = input.nextDouble();
    //Prompt for projects
    System.out.print("projects: ");
    double projects = input.nextDouble();
    //Prompt for Hw
    System.out.print("hw and labs: ");
    double hwandlabs = input.nextDouble();
    //Calculate final grade
    double finalgrade = (hwandlabs * .4) + (finalexam * .2) + (midtermexam * .2) + (projects * .2);
    System.out.println("Your final grade is: " + finalgrade + "%");
  }
}