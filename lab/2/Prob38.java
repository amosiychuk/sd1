// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 3.8
import java.util.Scanner;

public class Prob38 {
  public static void main(String[] args) {
    // Prompts the user for Three integers  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three integers");
    int integer1 = input.nextInt();
    int integer2 = input.nextInt();
    int integer3 = input.nextInt();
    //integers sorted into an increasing order using if statements
    if (integer1 <= integer2  && integer2 <= integer3) {
      System.out.println(integer1 + ", " + integer2 + ", " + integer3);
    }
    else if (integer1 <= integer3  && integer3 <= integer2) {
      System.out.println(integer1 + ", " + integer3 + ", " + integer2);
    }
    else if (integer2 <= integer1  && integer1 <= integer3) {
      System.out.println(integer2 + ", " + integer1 + ", " + integer3);
    }
    else if (integer2 <= integer3  && integer3 <= integer1) {
      System.out.println(integer2 + ", " + integer3 + ", " + integer1);
    }
    else if (integer3 <= integer1  && integer1 <= integer2) {
      System.out.println(integer3 + ", " + integer1 + ", " + integer2);
    }
    else {
      System.out.println(integer3 + ", " + integer2 + ", " + integer1);
    }
  }
}