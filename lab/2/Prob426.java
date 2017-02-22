// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 4.26

import java.util.Scanner;

public class Prob426 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompt for the amount
    System.out.print("Enter the amount: ");
    String amount = input.nextLine();

    //Find decimal's position
    int decimal = amount.indexOf('.');

    //Declare variables for cents, dollars, and total
    String cents = "";
    int dollars;
	int total;

    //Verify if decimal exists and extract cents
    if (decimal == -1) {
      total = Integer.parseInt(amount);
    }
    else {
      cents = amount.substring(decimal+1);

      //Simplify centString to a length of two
      if (cents.length() >= 2) {
        cents = cents.substring(0, 2);
      }
      else if (cents.length() == 1) {
          cents = cents + "0";
      } 
      else {
        cents = cents + "00";
      }
      //convert cents and dollars to integers
      total = Integer.parseInt(amount.substring(0, decimal) + cents);

    }
	
    int remainingAmount = total;

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of \n" + 
      "\t" + numberOfOneDollars + " dollars\n" + 
      "\t" + numberOfQuarters + " quarters\n" +
      "\t" + numberOfDimes + " dimes\n" + 
      "\t" + numberOfNickels + " nickels\n" +
      "\t" + numberOfPennies + " pennies");
  }
}
