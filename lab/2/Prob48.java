// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 4.8
import java.util.Scanner;

public class Prob48 {
  public static void main(String[] args) {
    //prompt for ASCII code
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int code = input.nextInt();
    //cast input into char datatype
    char ascii = (char)code;
    System.out.print("The character for the ASCII code " + code + " is " + ascii);
  }
}