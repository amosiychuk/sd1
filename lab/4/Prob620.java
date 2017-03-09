//Prob 6.20
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob620 {
  public static void main(String[] args) {
    // Prompt for a string
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a string: ");
    String inp = input.nextLine();
    //display the number of letters
    System.out.println("The number of letters within the string is " + countLetters(inp));
  }

  public static int countLetters(String s) {
    int counter = 0;
    for (int i = 0; i <= s.length()-1; i++) {
      if (Character.isLetter(s.charAt(i))) {
        counter++;
      }
    }

    return counter;
  }
}