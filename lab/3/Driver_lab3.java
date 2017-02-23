//Prob diffdistances
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Declare needed variables
    double x1;
    double y1;
    double x2;
    double y2;
    double p;
    double norm;
    double x;
    double y;
    //Loop to read input and calculate the norm
    while (true){
      x1 = input.nextDouble();
      //Terminates the loop for the final test case
      if(x1 == 0){
        break;
      }
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      p = input.nextDouble();
      x = x1 - x2;
      y = y1 - y2;
      // Compute the norm
      norm = Math.pow(( Math.pow(Math.abs(x), p)  +  Math.pow(Math.abs(y), p) ), 1 / p);
      //Display norm
      System.out.printf("%.4f \n", norm);
    }
  }
}
