//Prob 7.31
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob731 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    //input for array 1
    System.out.print("Enter list1: ");
    int x = input.nextInt();
    
    int[] inpValues1 = new int[x];
    
    for(int i=0; i < inpValues1.length; i++){
      inpValues1[i] = input.nextInt();
    }


    //input for array 2
    System.out.print("Enter list2: ");
    int y = input.nextInt();
    
    int[] inpValues2 = new int[y];
    
    for(int i=0; i < inpValues2.length; i++){
      inpValues2[i] = input.nextInt();
    }
    
    //sort the arrays
    java.util.Arrays.sort(inpValues1);
    java.util.Arrays.sort(inpValues2);
    
    int[] mergeValues = merge(inpValues1, inpValues2);
    
    for(int i=0; i < mergeValues.length; i++){
      System.out.print(mergeValues[i] + " ");
    }    
  }
  
  //merge method
  public static int[] merge(int[] list1, int[] list2){
    int[] mergeValues = new int[list1.length + list2.length];
    
    for(int i=0; i < list1.length; i++){
      mergeValues[i] = list1[i];
    }
  
    int c = list1.length;
  
    for(int i=c, j=0; (i < list1.length + list2.length && j < list2.length); i++, j++){
      mergeValues[i] = list2[j];
    }
    java.util.Arrays.sort(mergeValues);
    
    return mergeValues;
  }
}