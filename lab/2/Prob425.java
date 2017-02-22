// Alexander Mosiychuk
// Cmpt 220 lab 2
// prob 4.25


public class Prob425 {
  public static void main(String[] args) {
    // Generate uppercase letters
    char letter1 = (char)(Math.random() * 26 + 65);
    char letter2 = (char)(Math.random() * 26 + 65);
    char letter3 = (char)(Math.random() * 26 + 65);
    // Generate four digits
    int digit1 = (int)(Math.random() * 10);
    int digit3 = (int)(Math.random() * 10);
    int digit2 = (int)(Math.random() * 10);
    int digit4 = (int)(Math.random() * 10);
    //Display plate
    System.out.println("The plate number is: " + letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4);
  }
}