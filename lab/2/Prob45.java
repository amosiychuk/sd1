// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 4.5
import java.util.Scanner;

public class Prob45 {
  public static void main(String[] args) {
    //prompt for side amount and side length
    Scanner input = new Scanner(System.in);
    System.out.print("please enter the number of sides: ");
    double side = input.nextDouble();
    System.out.print("please enter the side length: ");
    double length = input.nextDouble();
    //compute area
    double area = (side * Math.pow(length,2)) / (4 * Math.tan(Math.PI / side ));
    //display the area
	System.out.print("The area is " + area);
  }
}