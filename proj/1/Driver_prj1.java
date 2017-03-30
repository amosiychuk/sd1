//Alexander Mosiychuk
//project 1

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int x = input.nextInt();
    int y = input.nextInt();
    
    double[] list1 = new double[x];
    double[] list2 = new double[y];
    
    //input values for the arrays
    for(int i=0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }
    
    for(int i=0; i < list2.length; i++){
      list2[i] = input.nextInt();
    }
    
    double[] convolved = convolveVectors(list1,list2);
    
    
    for(int i=0; i < (list1.length + list2.length)-1; i++){
      System.out.print(convolved[i]+ " ");
    }
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    for(int idx = 0; idx < (vFirst.length + vSecond.length) - 1; idx++){
      vResult[idx] = 0;
      //loop to compute the shift with if statement for out of bounds errors
      for(int shift = 0; shift < vSecond.length; shift++){        
        if((idx - shift) >= 0 && (idx - shift) < vFirst.length){
          vResult[idx] += vFirst[idx - shift] * vSecond[shift];
        }    
      }
    }
    return vResult;  
  }

}
