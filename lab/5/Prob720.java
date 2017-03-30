//Prob 7.20
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob720 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] inpValues = new double[10];
    //loop for input
    for(int i = 0; i<=9; i++) {
      System.out.print("Enter a value: ");
      inpValues[i] = input.nextDouble();
    }

    selectSort(inpValues);
    
    for(int i = 0; i<=9; i++) {
      System.out.print( inpValues[i] + " ");
    }
  }


  static void selectSort(double[] list) {
    double currentMax;
    int currentMaxIndex;

    for (int i = 0; i < list.length; i++) {
      // Declare value for comparison
      currentMax = list[i];
      currentMaxIndex = i;
      //evaluate if currentMax is the largest element
      for (int j = i + 1; j < list.length; j++) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      // Swap if needed
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
}