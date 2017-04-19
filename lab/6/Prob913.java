//Prob 9.1
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob913 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter values for the amount of rows and columns: ");
    int x = input.nextInt();
    int y = input.nextInt();
    double[][] inpValues = new double[x][y];
    
    //loop for input
    for(int j = 0; j < x; j++) {
      for(int i = 0; i < y; i++) {
        inpValues[j][i] = input.nextDouble();
      }
    }
    
    Location position = new Location();
    
    position = locateLargest(inpValues);
    
    System.out.println("The location of the largest element is " + position.maxValue 
      + " at (" + position.row + ", " + position.column + ")");
  }
  
  public static Location locateLargest(double[][] a){
    
    Location max = new Location();
    
    // j is the row index and i is the column index
    max.maxValue = a[0][0];
    for(int j = 0; j < a.length ; j++){
      for(int i = 0; i < a[j].length; i++){
        if( a[j][i] > max.maxValue){
          max.maxValue = a[j][i];
          max.row = j;
          max.column = i;
        }
      }
    }
    return max;
  }
}

class Location {
  //declare width and height
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;
  
  Location() {
  }


}