//author: Alexander Mosiychuk
//course: CMPT 220 
//assignment: lab 7 
//due date: April 27, 2017 
import java.math.*;

public class Prob1017 {
  public static void main(String[] args) {
    //first term to be squared is approximately the root of the long max value
    BigInteger squaredTerm = new BigInteger("3037000495");
    BigInteger incTerm = new BigInteger("1");
    BigInteger tempTerm = new BigInteger("0");
    BigInteger maxTerm = new BigInteger("9223372036854775807");
    
    byte counter = 0;
    
    while(counter < 10){
      //square and store square
      tempTerm = squaredTerm.multiply(squaredTerm);
      //print if condition is satisfied
      if(tempTerm.compareTo(maxTerm) == 1){
        System.out.println(tempTerm);
        counter++;
      } 
      //increment square term
      squaredTerm = squaredTerm.add(incTerm);      
    }
    
  }
}
