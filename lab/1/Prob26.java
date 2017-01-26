import java.util.Scanner;

public class Prob26 {
  public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt for an integer
    System.out.print("Enter an integer between 0 and 1000: ");
    int digitinput = input.nextInt();
    //Compute the sum of the digits
    int ones = digitinput % 10;
    int tens = (digitinput / 10) % 10;
    int hundreds =  (digitinput / 100) % 10;
    int thousands = (digitinput / 1000);
    int digitsum = ones + tens + hundreds + thousands;
    //Display the sum
    System.out.println("The sum of the digits is " + digitsum);
  }
}