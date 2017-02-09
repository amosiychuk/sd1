// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 3.11
import java.util.Scanner;

public class Prob311 {
  public static void main(String[] args) {
    // Prompts the user for the month and a year  
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number for a month, which is then followed by a year");
    int month = input.nextInt();
    int year = input.nextInt();
    //switch sequence to display the number of days
    switch (month) {
      case 1: System.out.println("January " + year + " had 31 days.");
              break;
      case 2: if (year % 4 == 0) {
                System.out.println("February " + year + " had 29 days.");
              }
              else {
                System.out.println("February " + year + " had 28 days.");
              }
              break;
      case 3: System.out.println("March " + year + " had 31 days.");
              break;
      case 4: System.out.println("April " + year + " had 30 days.");
              break;
      case 5: System.out.println("May " + year + " had 31 days.");
              break;
      case 6: System.out.println("June " + year + " had 30 days.");
              break;
      case 7: System.out.println("July " + year + " had 31 days.");
              break;
      case 8: System.out.println("August " + year + " had 31 days.");
              break;
      case 9: System.out.println("September " + year + " had 30 days.");
              break;
      case 10: System.out.println("October " + year + " had 31 days.");
              break;
      case 11: System.out.println("November " + year + " had 30 days.");
              break;
      case 12: System.out.println("December " + year + " had 31 days.");
              break;
    }
  }
}