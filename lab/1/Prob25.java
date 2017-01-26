import java.util.Scanner;

public class Prob25 {
  public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt for subtotal and gratuity
    System.out.print("Enter a subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityrate = input.nextDouble();
    //Compute total and gratuity
    double gratuity = (gratuityrate / 100) * subtotal;
    double total = subtotal + gratuity;
    //Display total and gratuity
    System.out.println("The Gratuity is " + gratuity + " and your total is " + total);
  }
}