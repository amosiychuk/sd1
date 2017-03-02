//Prob 6.3
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;
public class Prob63 {
  public static void main(String[] args) {
    //Prompt for input
    Scanner input = new Scanner(System.in);
    System.out.print("please enter an integer: ");
    int inpValue = input.nextInt();
    //Display the reversal of digits and if the input is is a palindrome
    System.out.print("The reversal of "+ inpValue + " is " + reverse(inpValue) + ". Furthermore, it is " 
      + isPalindrome(inpValue) + " that the input is a palindrome");
  }
  
  //Method to reverse digits
  public static int reverse(int number) {
    //Convert input to string
    String input = number + "";
    String reversed = "";
    int convReversed;
    //Loop to reverse the string
    for ( int i = input.length() - 1 ; i >= 0 ; i--){
      reversed += input.charAt(i);
    }
    //return reversed string to an integer
    convReversed = Integer.parseInt(reversed);
    return convReversed;
  }
  //method to evaluate if the input is a palindrome
  public static boolean isPalindrome(int number) {
    boolean palindrome = (number == reverse(number));
    return palindrome;
  }
}
