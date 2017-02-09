// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 3.15
import java.util.Scanner;

public class Prob315 {
  public static void main(String[] args) {
    //generate three digit lottery number
    int lottery = (int)(Math.random() * 1000);
    //prompt for a user's guess
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a three digit lottery number: ");
    int guess = input.nextInt();
    //find the digits of the generated lottery number
    int lotDigit1 = lottery / 100;
    int lotDigit2 = (lottery - lotDigit1 * 100) / 10;
    int lotDigit3 = (lottery - lotDigit1 * 100) % 10;
    // find the digits of input
    int guessDigit1 = guess / 100;
    int guessDigit2 = (guess - guessDigit1 * 100) / 10;
    int guessDigit3 = (lottery - guessDigit1 * 100) % 10;
    // evaluate the equality of digits
    if (lottery == guess){
      System.out.println("your guess matches the exact order, and you win $10,000");
    }
    // all digits match
    else if ( ( guessDigit1 == lotDigit2 || guessDigit1 == lotDigit3 || guessDigit1 == lotDigit1)
         && (guessDigit2 == lotDigit1 || guessDigit2 == lotDigit3 || guessDigit2 == lotDigit2)
         && (guessDigit3 == lotDigit2 || guessDigit3 == lotDigit1 || guessDigit3 == lotDigit3)){
      System.out.println("All digits have a match, and you win $3,000");
    }
    // guessDigit1 has a match
    else if ( guessDigit1 == lotDigit2 || guessDigit1 == lotDigit3 || guessDigit1 == lotDigit1) {
      System.out.println("a single digit has a match, and you win $1,000");
    }
    // guessDigit2 has a match
    else if ( guessDigit2 == lotDigit2 || guessDigit2 == lotDigit3 || guessDigit2 == lotDigit1) {
      System.out.println("a single digit has a match, and you win $1,000");
    }
    // guessDigit3 has a match
    else if ( guessDigit3 == lotDigit2 || guessDigit3 == lotDigit3 || guessDigit3 == lotDigit1) {
      System.out.println("a single digit has a match, and you win $1,000");
    }
    else {
      System.out.println("no match");
    }
  }
}