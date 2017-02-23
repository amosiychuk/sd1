//Prob 5.21
//Alexander Mosiychuk
//Cmpt 220
public class Prob512 {
  public static void main(String[] args) {
    //Loop to evaluate desired product
    int i = 1;
    while (i * i <= 12000 ) {
      i += 1;
    }

    System.out.println("The smallest n such that n*n > 12000 is " + i);
  }
}
