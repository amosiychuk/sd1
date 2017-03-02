//Prob 6.2
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;
public class Prob62 {
  public static void main(String[] args) {
    //Prompt for input
    Scanner input = new Scanner(System.in);
    System.out.print("please enter a value: ");
    long inpValue = input.nextLong();
    //Display the sum of digits
    System.out.print("The sum of the digits is " + sumDigits(inpValue));
  }
  
  //Method to compute sum
  public static int sumDigits(long n) {
    int castedInput = (int)n;
    int sum = 0;
    //Loop to compute the sum, using integer division to terminate the loop
    while (castedInput != 0) {
      int remainder = castedInput % 10;
      sum += Math.abs(remainder);
      castedInput = castedInput / 10;
    }

    return sum;
  }

}
