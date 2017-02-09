//Alexander Mosiychuk
//Cmpt 220 lab 2
//prob 3.4

public class Prob34 {
  public static void main(String[] args){
    // This section generates an integer between 1 and 12
    int month = (int)( Math.random() * 11.5 ) + 1;
    // the if-else to display the relavent month names
	if (month == 12) {
      System.out.print("The month is December.");
    }
    else if (month == 11) {
      System.out.print("The month is November.");
    }
    else if (month == 10) {
      System.out.print("The month is October.");
    }
    else if (month == 9) {
      System.out.print("The month is September.");
    }
    else if (month == 8) {
      System.out.print("The month is August.");
    }
    else if (month == 7) {
      System.out.print("The month is July.");
    }
    else if (month == 6) {
      System.out.print("The month is June.");
    }
    else if (month == 5) {
      System.out.print("The month is May.");
    }
    else if (month == 4) {
      System.out.print("The month is April.");
    }
    else if (month == 3) {
      System.out.print("The month is March.");
    }
    else if (month == 2) {
      System.out.print("The month is February.");
    }
    else {
      System.out.print("The month is January.");
    }
  }
}