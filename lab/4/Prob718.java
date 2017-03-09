//Prob 7.18
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob718 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] inpValues = new double[10];
    //loop for input
    for(int i = 0; i<=9; i++) {
      System.out.print("Enter a value for index " + i + " : ");
      inpValues[i] = input.nextDouble();
    }
    //sort array
    bubbleSort(inpValues);
    //print contents
    for(int i = 0; i<=9; i++) {
      System.out.println("the value of index " + i + " is " + inpValues[i]);
    }
  }
  
  static void bubbleSort(double[] list) {
    int count = 0;
    while(count < list.length) {
        
      for (int i = 0, j = 1; (i < list.length - 1 && j <= list.length - 1); j++,i++){
        if (list[i] > list[j]) {
          //swap list[i] with list[j]
          double temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
      count++;
    }
  }
}