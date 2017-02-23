//Prob 5.7
//Alexander Mosiychuk
//Cmpt 220
public class Prob57 {
  public static void main(String[] args) {
    //Set tuition to 10,000
    double tuition = 10000;
    double change = 0;
    //Loop to evaluate tuition after ten years
    for (int i = 1; i <= 10; i++) {
      tuition = tuition * 1.05;
    }
    // simplify tuition to 2 decimal places
    tuition = Math.rint(tuition * 100) / 100 ;
    //Calculate the cost of college for 4 years
    double cost = tuition * 4;
    //Display the cost
    System.out.println("The tuition after ten years is " + tuition + " therefore the cost of college will be " + cost );
  }
}
