import java.util.Scanner;

public class Prob21 {
  public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt for degrees celsius
    System.out.print("Enter a number for celsius: ");
    double celsius = input.nextDouble();
    //Compute fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;
    //Display fahrenheit
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}