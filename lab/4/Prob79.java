//Prob 7.9
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob79 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] inpValues = new double[10];
    //loop for input
    for(int i = 0; i<=9; i++) {
      System.out.print("Enter a value: ");
      inpValues[i] = input.nextDouble();
    }
    //declare variable to store min
    double min = inpValues[0];
    //loop to scan array
    for(int i = 0; i <= 9 ; i++) {
      if(inpValues[i]<= min){
        min = inpValues[i];
      }
    }
    //display the minimum
    System.out.println("the minimum value is: " + min);
  }
}