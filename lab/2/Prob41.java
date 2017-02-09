// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 4.1
import java.util.Scanner;

public class Prob41 {
  public static void main(String[] args) {
    //prompt for a length from center to vertex
    Scanner input = new Scanner(System.in);
    System.out.print("please enter the length from the center to the vertex: ");
    double length = input.nextDouble();
    // compute side length and area
    double side = 2.0 * length * ( Math.sin( Math.PI / 5.0 ) );
    double area = (5.0 * Math.pow( side, 2.0)) / (4.0 * Math.tan(Math.PI / 5.0));
    System.out.print("The area of the pentagon is " + Math.rint(area * 100) / 100 );
  }
}