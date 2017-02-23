//Prob 5.13
//Alexander Mosiychuk
//Cmpt 220
public class Prob513 {
  public static void main(String[] args) {
    //Loop to evaluate desired product
    int i = 120;
    while (i * i * i >= 12000.0 ) {
      i = i - 1;
    }
    System.out.println("The largest n such that n*n*n < 12000 is " + i);
  }
}
