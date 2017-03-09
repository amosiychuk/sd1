//Prob 6.8
//Alexander Mosiychuk
//Cmpt 220
public class Prob68 {
  public static void main(String[] args) {
    //Print the table's header
    System.out.print("Celsius     Fahrenheit   |     Fahrenheit     Celsius\n" +
      "_________________________________________________________________\n");
    //Declare needed variables
    double faren = 120.0;
    double cels = 40.0;
    //loop to generate table contents
    for (int i = 1; i <= 10; cels--, faren += -10, i++) {
      System.out.println(cels + "\t\t" + celsiusToFahrenheit(cels) + "\t | \t" + faren + "\t\t" + fahrenheitToCelsius(faren));
    }
  }
  
    public static double celsiusToFahrenheit(double celsius) {
     double temp = (9.0 / 5.0) * celsius + 32.0;
     temp = temp * 100;
     temp = ( (double) Math.round(temp) )/100;
     return temp;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    double temp = (5.0 / 9) * (fahrenheit - 32);
    temp = temp * 100;
    temp = ( (double) Math.round(temp) )/100;
    return temp;
  }
  
}
