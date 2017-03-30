//Prob 7.32
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob732 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    //input for array 1
    System.out.print("Enter list: ");
    int x = input.nextInt();
    
    int[] inpValues1 = new int[x];
    
    for(int i=0; i < inpValues1.length; i++){
      inpValues1[i] = input.nextInt();
    }

    partition(inpValues1);
    System.out.print("After the partition, the list is ");
    for (int i = 0; i < inpValues1.length; i++)
      System.out.print(inpValues1[i] + " ");
  }
  
  //partition method
  public static int partition(int[] list){
    int index = 0;
    int high = list.length-1;
    int left  = 1;
    int right = list.length-1;
    int pivot= list[index];
    
    while(right > left){
      while(left <= right && list[left] <= pivot)
        left++;
    
      while(left <= right && list[right] > pivot)
        right--;
    
      if(left < right){
        int temp = list[right];
        list[right] = list[left];
        list[left] = temp;
      }
    }
    while ( high > index && list[high] >= pivot)
      high--;

    // Swap pivot with list[high]
    if (pivot > list[high]) {
      list[index] = list[high];
      list[high] = pivot;
      return high;
    }
    else {
      return index;
    }
  }
}