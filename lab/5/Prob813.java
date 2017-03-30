//Prob 8.13
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob813 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter values for the amount of rows and columns: ");
    int x = input.nextInt();
    int y = input.nextInt();
    double[][] inpValues = new double[x][y];
    
    //loop for input
    for(int j = 0; j < x; j++) {
      for(int i = 0; i< y; i++) {
        inpValues[j][i] = input.nextDouble();
      }
    }
    int[] max = locateLargest(inpValues);
    System.out.print("The largest element is located at (" + max[0] + ", " + max[1] + ")");
  }


  public static int[] locateLargest(double[][] a) {
    double max = a[0][0];
    int row = 0;
    int col = 0;
    for(int j = 0; j < a.length; j++) {
      for(int i = 0; i< a[0].length; i++) {
        if(max < a[j][i]){
          max = a[j][i];
          row=j;
          col=i;
        }
      }
    }
    
    int[] maxPosition = {row,col};
    return maxPosition;
  }  
}