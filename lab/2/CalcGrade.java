//Alexander Mosiychuk

import java.util.Scanner;

public class CalcGrade {
  public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt for the relavent percentages
    System.out.println("Please enter the following as percentage ...");
    //Prompt for midterm     
    System.out.print("midterm exam: ");
    double midtermExam = input.nextDouble();
	//Prompt for final exam
    System.out.print("final exam: ");
    double finalExam = input.nextDouble();
    //Prompt for projects
    System.out.print("projects: ");
    double projects = input.nextDouble();
    //Prompt for Hw
    System.out.print("hw and labs: ");
    double hwAndLabs = input.nextDouble();
    //Calculate final grade
    double finalGrade = (hwAndLabs * .4) + (finalExam * .2) + (midtermExam * .2) + (projects * .2);
    //if else sequence to display letter Grade
    if (finalGrade >= 95.0) {
      System.out.println("Your final grade is: A ");
    }
    else if (finalGrade >= 90.0) {
      System.out.println("Your final grade is: A- ");
    }
    else if (finalGrade >= 87.0) {
      System.out.println("Your final grade is: B+ ");
    }
    else if (finalGrade >= 83.0) {
      System.out.println("Your final grade is: B ");
    }
    else if (finalGrade >= 80.0) {
      System.out.println("Your final grade is: B- ");
    }
    else if (finalGrade >= 77.0) {
      System.out.println("Your final grade is: C+ ");
    }
    else if (finalGrade >= 73.0) {
      System.out.println("Your final grade is: C ");
    }
    else if (finalGrade >= 70.0) {
      System.out.println("Your final grade is: C- ");
    }
    else if (finalGrade >= 65.0) {
      System.out.println("Your final grade is: D+ ");
    }
    else if (finalGrade >= 60.0) {
      System.out.println("Your final grade is: D ");
    }
    else {
      System.out.println("Your final grade is: F ");
    }
  }
}