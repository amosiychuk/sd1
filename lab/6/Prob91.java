//Prob 9.1
//Alexander Mosiychuk
//Cmpt 220
import java.util.Scanner;

public class Prob91 {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(4 , 40);
    Rectangle rect2 = new Rectangle(3.5 , 35.9);
    //display width, height,area, and perimiter
    System.out.println("For the first rectangle the width is " + rect1.width);
    System.out.println("For the second rectangle the width is " + rect2.width + "\n");
    
    System.out.println("For the first rectangle the height is " + rect1.height);
    System.out.println("For the second rectangle the height is " + rect2.height + "\n");
    
    System.out.println("For the first rectangle the area is " + rect1.getArea());
    System.out.println("For the second rectangle the area is " + rect2.getArea() + "\n");
    
    System.out.println("For the first rectangle the perimiter is " + rect1.getPerimiter());
    System.out.println("For the second rectangle the perimiter is " + rect2.getPerimiter());
  }
}

class Rectangle {
  //declare width and height
  double width = 1;
  double height = 1;
  // no arg constructor
  Rectangle() {
  }
  
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  
  //return area
  double getArea(){
    return width * height;
  }
  
  //return perimiter
  double getPerimiter(){
    return (2 * width) + (2 * height);
  }
}