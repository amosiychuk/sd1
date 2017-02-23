//Prob 5.1
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;
public class Prob51 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompt for and read input
    System.out.print("Enter an integer. The program terminates if 0 is entered: ");
    int data = input.nextInt();
    //Predeclare the needed variables
    int positive = 0;
    int negative = 0;
    double total = 0;
    //Do while loop to count positive and negative input
    do {
      //nested if to prevent 0 entry from changing the counter
      if(data != 0){
        if(data == Math.abs(data)){  
          positive += 1;
        }
        else {
          negative += 1;
        }
      }
      total = total + data;
      System.out.print("Enter an integer. The program terminates if 0 is entered: ");
      data = input.nextInt();
    } while (data != 0);

    //Compute the average
    double average = total / (positive + negative);
    System.out.println(positive);
    System.out.println(negative);
    System.out.println(total);
    System.out.println(average);
  }
}